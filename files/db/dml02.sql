-- dml merge

--신발가게 날짜별 매출
CREATE TABLE T_SHOE
(
    work_date DATE,  --영업일
    store_code NUMBER(3),  --매장 고유 코드 (PK) (10, 20, 30, 40 ..)
    sales_income NUMBER(10) --매출금액  
);

--옷가게 날짜별 매출
CREATE TABLE T_CLOTH
(
    work_date DATE,  --영업일
    store_code NUMBER(3),  --매장 고유 코드 (PK) (1,2,3,4...)
    sales_income NUMBER(10) --매출금액  
);


--본사 날짜별 전체 매출 취합
CREATE TABLE T_COMPANY
(
    work_date DATE,  --영업일
    store_code NUMBER(3),  --매장 고유 코드 (PK)
    sales_income NUMBER(10) --매출금액  
);

INSERT ALL
INTO T_SHOE VALUES (TO_DATE('2025-03-01'), 1, 5000)
INTO T_SHOE VALUES (TO_DATE('2025-03-02'), 1, 15000)
INTO T_SHOE VALUES (TO_DATE('2025-03-03'), 1, 30000)
INTO T_SHOE VALUES (TO_DATE('2025-03-02'), 2, 4000)
INTO T_SHOE VALUES (TO_DATE('2025-03-03'), 2, 90000)
INTO T_SHOE VALUES (TO_DATE('2025-03-04'), 2, 120000)
INTO T_SHOE VALUES (TO_DATE('2025-03-04'), 1, 90000)
select * from dual;


SELECT *
--DELETE
FROM T_SHOE WHERE work_date = '2025-03-07';

INSERT ALL
INTO T_CLOTH VALUES (TO_DATE('2025-03-01'), 10, 59000)
INTO T_CLOTH VALUES (TO_DATE('2025-03-02'), 10, 25000)
INTO T_CLOTH VALUES (TO_DATE('2025-03-03'), 10, 33000)
INTO T_CLOTH VALUES (TO_DATE('2025-03-04'), 20, 4400)
INTO T_CLOTH VALUES (TO_DATE('2025-03-05'), 20, 99000)
INTO T_CLOTH VALUES (TO_DATE('2025-03-06'), 20, 790000)
select * from dual;

select * from t_shoe;
select * from t_cloth;
select * from t_company;

insert into t_company
select * from t_shoe;

insert into t_company
select * from t_cloth;

insert into t_company
select work_date, store_code, sales_income from t_cloth;

select store_code , sum(sales_income)
from t_company
group by store_code;

select work_date, sum(sales_income)
from t_company
group by work_date
order by work_date;

--batch 처리 (주기적 , 특정시간 , 특정시점 수행)
-- ex)데이터 발생 -> 배치시작 새벽 2시

--이런식으로 t_shoe에 값 추가
insert into t_shoe values (to_date('2025-03-07'), 1, 210000);
--이런식으로 t_cloth의 값 변경
update t_cloth
set sales_income = 890000
where work_date = '2025-03-6'
and store_code = 20;
-- 이후 t_company를 어떻게 할 것인가?
-- 하드코딩
insert into t_company
select * from t_shoe
where work_date = '2025-03-07';

--임시 시나리오
--데이터가 밤 22~24시 저장(어제)
--배치 시작 새벽 2시 (오늘)
--insert into t_company
select *
from t_shoe
where to_char(work_date,'yyyymmdd') = to_char(to_date('2025-03-08')-1,'yyyymmdd');

-- merge 사용
-- merge into 저장대상 테이블명(최종취합)
-- using 데이터를 가져올 테이블명
-- on (병합/비교 기준조건)
-- when matched then (기준에 해당하는 데이터가 있는 경우)
--  update set -- 수정
--  delete where -- 삭제
-- when not matched then (기준에 해당하는 데이터가 없는 경우)
--  insert values... (기존에 없는 값이니 그냥 추가만 하면 됨)

-- 테스트 병합 전 기존 테이터 삭제
select *
--delete
from t_company;

merge into t_company a
using t_shoe b
on (a.work_date = b.work_date)
when matched then
    update set a.sales_income = b.sales_income
when not matched then
    insert values (b.work_date,b.store_code,b.sales_income);
    
merge into t_company a
using t_cloth b
on (a.work_date = b.work_date)
when matched then
    update set a.sales_income = b.sales_income
when not matched then
    insert values (b.work_date,b.store_code,b.sales_income);
    
-- 날자 1개 기준으로 처리하면 -> 동일 날자 겹침 -> 데이터 덮어쓰기 -> 망함
-- 날짜 + 매장코드를 병합기준으로 개선하기
drop table t_company;

merge into t_company a
using t_shoe b
on (a.work_date = b.work_date and a.store_code = b.store_code)
when matched then
    update set a.sales_income = b.sales_income
when not matched then
    insert values (b.work_date,b.store_code,b.sales_income);

merge into t_company a
using t_cloth b
on (a.work_date = b.work_date and a.store_code = b.store_code)
when matched then
    update set a.sales_income = b.sales_income
when not matched then
    insert values (b.work_date,b.store_code,b.sales_income);
    
select * from t_company;

--전체 데이터 취합 t_company
--날짜 + 매장코드 기준 조회

select store_code  
     , sum(sales_income)
from t_company
group by store_code;

select work_date  
     , sum(sales_income)
from t_company
group by work_date
order by work_date;

-- 신발가게 매출만 t_shoe
select * 
from t_company
where store_code in (select Distinct (store_code) 
                     from t_shoe);
                     
-- 매장 판매유형 구분코드 컬럼 추가 테이블
create table t_company_type
(
    work_date date, -- 영업일
    store_code number(3), -- 매장 고유 코드 , PK
    sales_income number(10),-- 매출
    store_type varchar2(8) -- 매장 유형 구분코드 S , C 
);

merge into t_company_type a
using t_shoe b
on (a.work_date = b.work_date and a.store_code = b.store_code)
when matched then
    update set a.sales_income = b.sales_income
when not matched then
    insert values (b.work_date,b.store_code,b.sales_income , 'S');

merge into t_company_type a
using t_cloth b
on (a.work_date = b.work_date and a.store_code = b.store_code)
when matched then
    update set a.sales_income = b.sales_income
when not matched then
    insert values (b.work_date,b.store_code,b.sales_income , 'C');

select * from t_company_type;

select *
from t_company_type
where store_type = 'S';

select store_type 
     , store_code
     , sum(sales_income)
from t_company_type
group by store_type , store_code
order by store_type , store_code;


select store_type 
     , store_code
     , sum(sales_income)
from t_company_type
group by rollup(store_type , store_code);