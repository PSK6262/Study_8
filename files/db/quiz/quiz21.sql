--1
select p1.profno
     , p1.name
     , d.dname
from department d 
    inner join ( select deptno , min(hiredate) as m_hiredate
                 from professor
                 group by deptno ) p2
        on d.deptno = p2.deptno
    inner join professor p1
        on p1.deptno = p2.deptno and p1.hiredate = p2.m_hiredate
order by p1.hiredate;

--2
select name
     , position
     , pay
from emp2
where (position,pay) in ( select position , max(pay)
                          from emp2
                          group by position)
order by pay;

--3
select d.dname
     , md.max_height
     , s1.name
     , s1.height
from student s1 
    inner join department d
        on s1.deptno1 = d.deptno
    inner join (select s.deptno1 , max(s.height) as max_height
                from student s
                group by s.deptno1) md
        on s1.deptno1 = md.deptno1 and s1.height = md.max_height;
        
--4
select s1.grade
     , s1.name
     , s1.height
     , s2.avh as avg_height
from student s1
    inner join (select grade, avg(height) as avh
                from student
                group by grade) s2
        on s1.grade = s2.grade
where s1.height > s2.avh
order by s1.grade;