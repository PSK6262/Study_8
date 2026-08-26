-- sub query

--select () 스칼라 서브쿼리 -> 걍 외울필요X
--from ()인라인 뷰
--where () 서브쿼리

select *
from emp
where deptno = (select deptno
                from emp 
                where empno = 7844);

select *
from emp2
where deptno in (select dcode
                 from dept2
                 where area ='Pohang Main Office')
and deptno <> '0001';

select *
from emp2 e2
where exists (select dcode
                 from dept2
                 where area ='Pohang Main Office'
                 and dcode = e2.deptno);
                 
select *
from student
where height < (select height
                from student
                where studno = 9513);

select *
from student
where weight > (select max(weight)
                from student
                where grade = 2);
                
select *
from student
where weight < all (select max(weight)
                    from student
                    group by grade);
--any , all

--            예시값
-- < any 81 82 83 58 / 이 중에 하나보다 작으면 됨 ( 83보다 작으면 됨 )
-- < all       ''    / 예시값 전체보다 작아야 함( 58보다 작아야 함 )
-- > any
-- > all
-- 단일행 비교  = , in
-- 다중행 비교 in , not in , any , all
-- 다중컬럼 비교 (컬럼숫자 맞춰서 비교)

--각 학급별 몸무게가 제일 높은 사람
select *
from student
where (grade, weight) in (select grade, max(weight)
                          from student
                          group by grade);
                          
select * from emp2;
select avg(pay) from emp2;

select *
from emp2
where pay > (select avg(pay)
             from emp2);
             
--자신의 평균 부서보다 많이 받는 사람
select a.position
     , a.name
     , a.pay
from emp2 a
where a.pay > (select avg(b.pay) 
               from emp2 b
               where b.position = a.position 
               group by position);
               
--자신의 평균 고용형태 보다 많이 받는 사람
select *
from emp2;

select emp_type,avg(pay)
from emp2
group by emp_type;

select *
from emp2 a
where a.pay > (select avg(pay)
               from emp2 b
               where b.emp_type = a.emp_type
               group by emp_type);
----
select * from emp2;
select * from dept2;

--join
select e.name
     , e.deptno
     , d.dname
from emp2 e
    inner join dept2 d
        on e.deptno = d.dcode;
        
--sub query
select e.name
     , e.deptno
     , (select dname
        from dept2
        where dcode = e.deptno)
from emp2 e;

select * from panmae;
select * from product;

--join
select pa.p_date
     , pa.p_code
     , pr.p_name
from panmae pa
    inner join product pr
        on pa.p_code = pr.p_code;

--sub query
select pa.p_date
     , pa.p_code
     , (select p_name
        from product
        where pa.p_code = p_code) as 상품명
from panmae pa;

--
select job
     , mgr
     , sal
     , comm
     , deptno
from emp;


select * -- from 아래 있는 3개만 나옴 , as로 바꾸면, 위의 select에도 e1,e2,e3로 입력해야 됨
from (select empno as e1
           , ename as e2
           , job as e3
      from emp);
      
select *
from emp2 a 
    inner join (select emp_type , trunc(avg(pay)) as avg_pay
               from emp2
               group by emp_type) b
on a.emp_type = b.emp_type
and a.pay < b.avg_pay;
               