--1
select studno,name,id
from student
where height >= 160 and height <=175
union all
select profno,name,id
from professor
where deptno in (101,102,103,201) and bonus is null;

--2
select '이름:'||name as 이름,
       '아이디:'||id as 아이디,
       '주민번호:'||substr(jumin,1,6)||'-'||substr(jumin,7) as 주민번호
from student;