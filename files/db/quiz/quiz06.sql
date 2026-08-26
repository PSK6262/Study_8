--1
select ename as ename,
       substr(ename,1,2)||'--'||substr(ename,5) as replace
from emp
where deptno = 20;
--2
select name,
       rpad(substr(jumin,1,6),length(jumin),'-/') as 주민뒷자리숨김
from student
where deptno1 = 101;
--3
select name,
       tel,
       rpad(substr(tel,1,instr(tel,')')),length(tel)-5,'*')||
       substr(tel,instr(tel,'-')) as replace
from student
where deptno1 = '102';

--3 option
select name,
       tel,    
       substr(tel, 1, instr(tel,')')) ||
       rpad('*', instr(tel,'-') - instr(tel,')') - 1 ,'*') ||
       substr(tel, instr(tel,'-')) as replace2
       -- 총 길이에서 - 까지의 길이를 뺀 값이 뒷자리 번호의 길이 a = length(tel) - instr(tel,'-')
       -- ) 까지의 길이가 앞자리 번호의 길이 b = instr(tel,')')
       -- 전체 길이에서 (a+b)를 빼면 => 중간 번호의 길이는 instr(tel,'-') - instr(tel,')')
from student;

--4
select name,
       tel,
       rpad(substr(tel,1,instr(tel,'-')),length(tel),'*') as replace
from student
where deptno1 = '101';