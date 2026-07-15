-- DDL create
create table new_table1
(
    num_id number(3) not null,
    name varchar2(16),
    birth date
);
select * from new_table1;

desc new_table1;

drop table new_table1;

select * 
from tab
where tname like '%NEW%'; -- NEW가 들어있는거 , 대소문자 구분

-- 테이블 복사 ( 구조 + 데이터 )

create table dept3
as
select * from dept2;

desc dept3; -- shift + f4
select * from dept3;

-- 테이블 일부만 복사
create table dept4
as
select dcode , dname from dept2;

select * from dept4;

create table dept5
as
select * from dept2
where 1=2; -- false / 테이블은 만들어지는데(릴레이션 스키마까지 복사) 값 복사(릴레이션 인스턴스)는 안된다

desc dept5;
select * from dept5;
-- 테이블 수정

select * from dept4;
-- loc 추가
alter table dept4
add (loc varchar2(32));
-- lv 추가 ( 기본값 1 )
alter table dept4
add (lv number(3) default 1);
-- lv 삭제
alter table dept4
drop column lv;
-- 내부 데이터 포맷(초기화)
truncate table 테이블명;

-- DDL rollback 불가능, 자동 commit

select * from dept4;
truncate table dept4;
drop table dept4;
