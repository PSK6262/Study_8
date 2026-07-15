-- rownum
select rownum
     , ceil(rownum / 3) as 팀
     , studno 
     , name
     , height
from student
order by height;

select rownum
     , studno
     , name
     , height
from (select rownum 
           , ceil(rownum / 3) as 팀
           , studno 
           , name
           , height          
      from student
      order by height);

select *
from student
where rownum <= 5;

--키큰사람 5명
select rownum
     , studno
     , name
     , height
from (select *
       from student
       order by height desc)
where rownum <= 5;


-- 팀번호 팀조회
select *
from (select rownum rn
           , ceil(rownum/3) as team
           , studno
           , name
        from student)
where team = 3;

-- group by
select *
from emp a inner join (select deptno , max(sal)
                       from emp
                       group by deptno) b
on a.deptno = b.deptno;

select d.deptno
     , dn.mx_s
     , d.dname
from dept d inner join (select deptno , max(sal) as mx_s
                        from emp
                        group by deptno) dn
on d.deptno = dn.deptno;

select deptno
     , mx_s
     , (select dname 
        from dept 
        where deptno = e.deptno)
from (select deptno
           , max(sal) mx_s
      from emp
      group by deptno) e;


select deptno 
     , dname
     , max(sal)
from (select e.deptno
           , e.sal
           , d.dname
      from emp e inner join dept d
      on e.deptno = d.deptno)
group by deptno
       , dname;