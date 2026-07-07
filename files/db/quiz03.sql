--1
select deptno as 부서번호 ,
       dname as 부서이름 ,
       loc as 위치
from dept;

--2
select name || '(' || ID || ')' as 교수정보 , 
       position ,
       hiredate as 입사일자,
       email as 이메일
from professor