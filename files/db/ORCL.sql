select * from dept;
select
    job,
    hiredate,
    mgr
from emp;

//--------------- 컬럼명 별칭

select
    empno AS "사원번호",
    ename "사원명",
    job 직업,
    sal "급여 데이터"
from emp;

//--------------- 리터럴 값 활용

//select '문자', 123 from emp;
// '문자' 123이 12개 나온다.

select * from dept;
//4개
//select '문자',123 from dept;
select '문자확인' AS "문자컬럼별칭",
        123+234-33 숫자연산결과
from dual;

select dname, loc , '문자안녕' , 1234 from dept;

select q'[이안에 문자 '작은"큰]' from dual;

//------------- 문자 이어붙이기
select '문자' || '이어붙이기' from dual;
select * from dept;
select deptno, dname from dept;
select deptno || dname AS str from dept;
select 
    '부서번호 : ' || deptno as 부서,
    deptno,
    '부서번호+500 = ' || (deptno + 500) 더하기500
from dept;
// distinct

select job from emp;
select distinct job from emp; //distinct(job) 가능
select distinct job , deptno from emp; // 
