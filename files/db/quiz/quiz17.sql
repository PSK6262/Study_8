--1
select s.name as stu_name
     , s.deptno1 
     , d.dname as dept_name
from student s 
    inner join department d
        on s.deptno1 = d.deptno
order by s.deptno1;

--2
select e.name 
     , e.position
     , to_char(e.pay,'999,999,999') as pay
     , to_char(p.s_pay,'999,999,999') as "low pay"
     , to_char(p.e_pay,'999,999,999') as "high pay"
from emp2 e 
    inner join p_grade p
        on e.pay between p.s_pay and p.e_pay
where e.position is not null;

--3
select e.name
     , trunc((to_date('2010/05/30') - birthday)/365) as 만나이
     , '2010' - to_char(birthday,'yyyy') + 1 as 한국나이
     , e.position
     , p.position
from emp2 e 
    inner join p_grade p
        on '2010' - to_char(birthday,'yyyy') + 1 between p.s_age and p.e_age
order by birthday desc;

--4
select c.gname
     , c.point
     , g.gname
from customer c 
    inner join gift g
        on c.point >= 600000
where g.gno = 7;

-- sub query
select *
from customer
where point >= (select g_start
                from gift
                where gno = 7);
                
--5
select profno
     , name
     , hiredate
     , RANK() OVER (order by hiredate) - 1 as count
from professor;

--6
select e1.empno
     , e1.ename
     , e1.hiredate
     , count(e2.hiredate) as count
     -- , rank() over (order by hiredate) -1 as count  안 쓰기
from emp e1 
    left outer join emp e2
        on e1.hiredate > e2.hiredate
group by e1.empno
       , e1.ename
       , e1.hiredate
order by count(e2.hiredate);

--sub query
select e1.empno
     , e1.ename
     , e1.hiredate
     , (
         select count(e2.hiredate) 
         from emp e2
         where e1.hiredate > e2.hiredate
       ) as count
from emp e1
order by count;