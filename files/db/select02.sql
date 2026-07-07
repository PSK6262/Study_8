// where

select *
from emp 
where job = 'SALESMAN';

select *
from emp
--where deptno != 10;
--같은의미
where deptno <> 10;

select *
from student
--where weight >= 55
-- and , or --
--where weight >= 55 and weight <= 70;
where weight between 55 and 70;

select *
from student
--where grade between 1 and 3;
--where grade in (1,2,3);
where grade not in (1,3);

--like 패턴검색 문자 % 0~n개 , _ 해당위치 한개

select *
from emp
--where ename like '%M%'; --M이 있는거 전부
--앞에 한글자 뭔가가 있고 --M + 아무거나
where ename like '_M%';

--null
select *
from emp
--where comm is null;
where comm is not null;

--날짜 , 미래일수록 큰 값
select *
from emp -- 테이블 정보 확인 SHIFT + F4
-- 날짜는 date
--where hiredate = '80/12/17'; -- yy/mm/dd , yyyy-mm-dd
where hiredate <= '1981-04-05';

-- 단순조회 -> 정렬 명시X -> 순서보장X
-- order by // asc 기본값 // desc
select name,grade
from student
order by grade;

--키 내림차순
select name,grade,height
from student
where grade in (1,2,3)
order by height,grade desc; -- 키 오름차순, grade 내림차순 , 키가 같다면 grade 높은사람이 위
--order by grade,height desc; -- grade 오름차순 , 키 내림차순

--생일 오름차순
select *
from student
order by birthday;