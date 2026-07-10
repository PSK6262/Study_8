--join

--어떤 기준을 통해서 테이블데이터 합쳐서 조회

select * from emp;
select * from dept;


select A.empno ,
       A.ename ,
       B.dname ,
       B.loc , 
       A.deptno ,
       B.deptno
from emp A, dept B
where A.deptno = B.deptno;

select e.empno, 
       e.ename, 
       d.dname, 
       d.loc , 
       e.deptno,
       d.deptno
from emp e inner join dept d
on e.deptno = d.deptno;

select e.empno,e.ename,e.deptno,d.dname,d.loc
from emp e , dept d
where e.deptno = d.deptno
and e.deptno in (20,30);

select e.empno,e.ename,e.deptno,d.dname,d.loc
from emp e inner join dept d
on e.deptno = d.deptno
and e.deptno in (20,30);

select *
from emp e,dept d; -- 조인 조건 누락 -> cartesian product emp(12) * dept(4) = 48가지 출력

select * from student;
select * from professor;

select s.studno 학번
     , s.name 학생이름
     , p.profno 교번
     , p.name 교수이름
     , p.email 교수이메일
from student s inner join professor p
on s.profno = p.profno;

-------------inner join vs outer join
select s.name 학생이름
     , p.name 교수이름
     , s.studno 학번
     , p.profno 교번
     , p.email 교수이메일
from student s , professor p
where s.profno = p.profno; -- 결과 15행

select count(*) from student; -- 20행
select count(*) from professor; -- 16행
--inner join -> 기준에 따라 합침 , 지도교수(profno = null) 안 적힌 사람 제거

select s.name 학생이름
     , p.name 교수이름
     , s.studno 학번
     , p.profno 교번
     , p.email 교수이메일
     , nvl2(s.profno,'지도교수 배정완료','지도교수 배정요망') as 배정여부
from student s , professor p
where s.profno = p.profno(+);

select s.name 학생이름
     , p.name 교수이름
     , s.studno 학번
     , p.profno 교번
     , p.email 교수이메일
     , nvl2(s.profno,'지도교수 배정완료','지도교수 배정요망') as 배정여부
from student s left outer join professor p 
on s.profno = p.profno;

--join 결과개수

select count(*)
from student s , professor p
where s.profno = p.profno;

select count(*)
from student s left outer join professor p
on s.profno = p.profno; 

select count(*)
from student s right outer join professor p
on s.studno is null;
