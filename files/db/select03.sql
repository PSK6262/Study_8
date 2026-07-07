--집합
--union 합
--intersect 교
--minus 차
--제약조건 (column 개수, 데이터 타입 동일)

select *
from student
where deptno1 in (101,102);
-- 동일 결과
select *
from student
where deptno1 = 101
union all
select *
from student
where deptno1 = 102;

select *
from student
where deptno1 = 101
union all
select *
from student
where deptno1 = 102 and height > 170;

--101번 학과 학생 + 101학과 교수 , 합집합

select studno as 식별변호 ,name as 이름 ,deptno1 as 학과 ,tel 연락처
from student
where deptno1 = 101
union all
select profno,name,deptno, NULL
from professor
where deptno = 101
order by 2;

--교집함

select *
from student
where deptno1 = 101
intersect
select *
from student
where deptno2 = 201;

-- 차집합
-- 상을 주려고 한다.
select *
from emp
where job = 'SALESMAN' and comm > 0
minus
--이전 수상자는 빼기 ( 가상 테이블임 , 그냥 그렇다 치기 )
select *
from emp
where hiredate < '1982-01-01';