--1
select deptno as 부서번호,
       avg(sal) as 평균급여
from emp
group by deptno 
having avg(sal) >= 2000;

--2
select p_date as 판매일자,
       sum(p_qty) as 판매수량,
       sum(p_total) as 판매금액
from panmae
group by p_date
order by p_date;

--3
select p_date as 판매일자,
       p_code as 상품코드,
       sum(p_qty) as 판매수량,
       sum(p_total) as 판매금액
from panmae
group by rollup(p_date, p_code);

