--1
select profno,
       name,
       pay,
       bonus,
       decode(bonus,null,(pay*12),(pay*12)+bonus) as total
from professor
where deptno = '201';
--2
select empno,
       ename,
       comm,
       nvl2(comm,'Exist','NULL') as nvl2
from emp
where deptno = '30';