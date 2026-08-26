select * from student;
select * from department;
select * from professor;


select s.name
     , s.grade
     , p.name
     , p.deptno
     , d.dname
from student s 
    inner join professor p
        on s.profno = p.profno
    inner join department d
        on p.deptno = d.deptno
where p.deptno not in(301);