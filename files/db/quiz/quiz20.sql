--1
select name
     , position
     , pay
from emp2
where pay > (select min(pay)
             from emp2
             where position = 'Section head')
order by pay desc;

--2
select name
     , grade
     , weight
from student
where weight < (select min(weight)
                from student
                where grade = 2);

--3
select 
    (select d.dname 
     from dept2 d 
     where e.deptno = d.dcode) as dname
     , name
     , pay
from emp2 e
where pay < (select min(ap) 
             from (select avg(pay) as ap
                   from emp2
                   group by deptno));
