select * from department;
select * from student;
select * from professor;

select s.name
     , p.name
     , d.dname
from student s inner join professor p
on s.profno = p.profno
inner join department d
on s.deptno1 = d.deptno
where s.deptno1 = 101;

----------
select s.name
     , s.deptno1
     , d.dname
     , p.name
     , p.deptno
from student s inner join department d
on s.deptno1 = d.deptno
inner join professor p
on s.profno = p.profno;


select s.name
     , s.deptno1
     , d.dname
     , p.name
     , p.deptno
from professor p inner join department d
on p.deptno = d.deptno
inner join student s
on s.profno = p.profno;

select s.name 
     , s.deptno1
     , ds.dname 
     , p.name
     , p.deptno
     , dp.dname
from student s 
    inner join professor p 
        on s.profno = p.profno
    inner join department ds 
        on s.deptno1 = ds.deptno
    inner join department dp
        on p.deptno = dp.deptno;
        
--등가 조인 비등가 조인
-- 등가 조인 조인의 연결 조건 => 같다, 비등가 => 다른 조건으로 연결함
select *
from customer;
select *
from gift; --범위에 해당하면 사은품

-- point가 g_start , g_end 사이에 들어가면 해당 사은품 수령
select *
from customer c inner join gift g
on c.point between g.g_start and g.g_end;

--셀프 조인
select e_low.empno as 사번
     , e_low.ename as 이름
     , e_low.job as 직급
     , e_low.mgr as "매니저 번호"
     , e_high.empno as "매니저 사번" 
     , e_high.ename as "매니저 이름"
     , e_high.job as "매니저 직급"
from emp e_low inner join emp e_high
on e_low.mgr = e_high.empno;

select a.empno
     , a.name
     , a.pempno
     , b.empno
     , b.name
from emp2 a inner join emp2 b
on a.pempno = b.empno;

