--1
select stu.studno as 학번
     , stu.name as 이름
     , sco.total as 점수
     , hak.grade as 학점
from student stu 
    inner join score sco
        on stu.studno = sco.studno
    inner join hakjum hak
        on sco.total between hak.min_point and hak.max_point
order by total desc;

--2
select stu.studno as 학번
     , stu.name as 이름
     , sco.total as 점수
     , hak.grade as 학점
from student stu
    inner join score sco
        on stu.studno = sco.studno
    inner join hakjum hak
        on sco.total between hak.min_point and hak.max_point
where stu.deptno1 in (101,102)
order by total desc;

--3
select s.name
     , s.grade
     , p.name
     , d.deptno
     , d.dname
from student s 
    inner join professor p
        on s.profno = p.profno 
    inner join department d
        on p.deptno = d.deptno --"지도교수" 가 속한 학과이름
where s.deptno1 != 301;
