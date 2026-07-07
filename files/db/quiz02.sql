--1
select *
from emp
order by ename;
--2
select *
from emp
order by deptno, sal desc;
--3
select *
from emp
where sal > 2000
order by sal desc;
--4
select *
from student
where grade not in(1)
order by grade;