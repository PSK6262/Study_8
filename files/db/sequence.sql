-- 시퀀스
-- 순차적으로 값을 사용하는 용도
-- 호출 할 때 마다 자동증가 ( 기본키에 사용가능 )

create sequence t_sequence
increment by 1
start with 1
minvalue 1
maxvalue 10;
--cycle // default : nocycle
--nocycle
--cache 20 // 메모리에 미리 저장해둘 숫자

drop sequence t_sequence;

t_sequence.nextval; -- 다음값 호출
t_sequence.currval; -- 현재값 확인

-----------
create table seq_test
(
    no number(6) primary key,
    name varchar2(32)
);

select * from seq_test;
--수동으로 pk값 확인하고 처리
insert into seq_test values (1, '이름1');
insert into seq_test values (2, '이름2');
--서브쿼리로 no 순번값 계산 후 처리 (count)
select count(*) from seq_test;
select count(*)+1 from seq_test;
insert into seq_test values ( (select count(*)+1 from seq_test), '이름3');
insert into seq_test values ( (select count(*)+1 from seq_test), '이름4');
insert into seq_test values ( (select count(*)+1 from seq_test), '이름5');
--3번 사용자 탈퇴
select *
--delete -> 이후 다시 insert 하면 무결성 제약조건에 위배 -> 저장 불가
from seq_test 
where no = 3;
-- 이 경우엔 탈퇴시 튜플을 완전 삭제하기보단 데이터의 값 부분만 날리고
-- 상태값 Y N으로 구분하는게 맞아보인다.

--서브쿼리로 no 순번 값 계산으로 처리 (max)
select max(no)
from seq_test;

--이 다음 no값 // 만약 데이터가 아예 없다면 null이라 안됨 (null처리 해야함)
insert into seq_test values ((select nvl(max(no),0 )+1 from seq_test),'이름6');

select * from seq_test;

--null처리 예시
select nvl(max(no),0) + 1
from seq_test;
select nvl(max(no)+1,1) 
from seq_test;


--sequence로 no 순번값 처리
create sequence test_sequence_pk
increment by 1
start with 1;

select test_sequence_pk.nextval from dual; --호출하는순간 사용됨 , 증가
select test_sequence_pk.currval from dual; --현재값 확인 , 증가 안함


insert into seq_test values (test_sequence_pk.nextval,'이름7');
insert into seq_test values (test_sequence_pk.nextval,'이름8');
insert into seq_test values (test_sequence_pk.nextval,'이름9');

select * from seq_test;

-- pk를 시퀀스로 사용 .. 코드와 결합 'CL' || seq.nextval ..
-- 시퀀스 1부터? 삭제후 재생성-> 근데 할거면 제대로 초기화
-- 초기화 말고는 / 다음 시퀀스 값 조정
select test_sequence_pk.currval from dual;

-- 현재 값에 - 넣고, 한번 호출 // 사실 큰의미없음
alter sequence test_sequence_pk increment by -9;
alter sequence test_sequence_pk minvalue 0;

select test_sequence_pk.nextval from dual;
alter sequence test_sequence_pk increment by 1;

select test_sequence_pk.nextval from dual;

----------------
create sequence seq1
start with 1
increment by 1
minvalue 1
maxvalue 5
nocycle;

select seq1.nextval from dual; -- 5가 찍히는 순간부터 더 사용 불가

create sequence seq2
start with 1
increment by 1
minvalue 1
maxvalue 5
cycle
cache 3;

select seq2.nextval from dual; -- 순환 (PK에 사용불가)