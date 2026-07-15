--1
select s.name
     , s.deptno1
     , d.dname
from student s
    inner join department d
        on s.deptno1 = d.deptno
where s.deptno1 in (select s2.deptno1
                  from student s2
                  where name = 'Anthony Hopkins');
                
--2
select p.name
     , p.hiredate
     , (select d.dname
        from department d
        where p.deptno = d.deptno) as dname
from professor p
where hiredate > (select hiredate
                  from professor
                  where name = 'Meg Ryan')
order by p.hiredate;

--3
select name
     , weight
from student
where weight > (select avg(weight)
                from student
                where deptno1 = 201);

--4
select e.empno
     , e.name
     , e.deptno
from emp2 e
    inner join dept2 d
        on e.deptno = d.dcode
where substr(area,1,instr(area,' ')-1) = 'Pohang';

--4 sub query
select empno
     , name
     , deptno
from emp2
where deptno in (select dcode
                 from dept2
                 where substr(area,1,instr(area,' ')-1) = 'Pohang');