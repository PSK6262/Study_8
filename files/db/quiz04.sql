--1
select name as 이름,
       substr(birthday,1,2) as 년도 , 
       substr(birthday,4,2) as 월,
       substr(birthday,7,2) as 일
from student;
--2
select name,
       tel, 
       instr(tel,')') as 괄호위치
from student
where deptno1 = '201';
--3
select name,
       tel,
       instr(tel,'3') as 첫3위치
from student
where deptno1 = '101';
--4
select name,
       tel,
       substr(tel,1,instr(tel,')')-1) as 지역번호
from student
where deptno1 = '201';