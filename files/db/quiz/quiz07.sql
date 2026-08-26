--1
select studno,
       name,
       to_char(birthday, 'yyyy-mm-dd') as birthday
from student
where to_char(birthday,'mm') = '01';
--2
select empno,
       ename,
       hiredate
from emp
where to_char(hiredate,'mm') in ('01','02','03');
--3
select empno,
       ename,
       to_char((sal*12)+comm,'999,999,999') as salary
from emp
where ename = 'ALLEN';
--4
select empno,
       ename,
       hiredate,
       to_char((sal*12)+comm,'$999,999') as sal,
       to_char(((sal*12)+comm)* 115 / 100,'$999,999') as "15%인상"
from emp
where comm is not null;