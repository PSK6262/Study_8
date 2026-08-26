-- 단일행 함수

select * 
from dual;

select initcap('abc') from dual;

select ename, initcap(ename) from emp;

select name , lower(name) , upper(name)
from student;

select name , length(name)
from student;

select *
from emp
where length(ename) >= 5;

select
    '아침' || '점심', concat('아침','점심')
from dual;

--substr (대상값|column명 , 시작지점(1부터 0아님), 자릿수)
select
    substr('abcdefg',1,3),
    substr('abcdefg',3,5),
    substr('abcdefg',-4,2)
from dual;

--instr (대상값, 찾는값 , (선택)시작위치 , (선택)몇번째값)
select 
    '2026-01-02 10:11:33',
    instr('2026-01-02 10:11:33','-'),
    instr('2026-01-02 10:11:33','-',6),
    instr('2026-01-02 10:11:33','-',1,2) -- 두번째 값
from dual;

select
    tel,
    concat(concat(substr(tel,1,instr(tel,')')-1),'-'),
    substr(tel,instr(tel,')')+1))
from student;

select
    tel,
    instr(tel,')'),
    instr(tel,'-')
from student;
--문자 채우기
select
    lpad('문자',10,'-'), 
    rpad('13ab',8,'*')
from dual;
-- trim
select
    '*' || ' abcd ' || '*' ,
    '*' || ltrim(' abcd ') || '*' ,
    '*' || rtrim(' abcd ') || '*' ,
    '*' || trim(' abcd ') || '*' ,
    rtrim('**abcd**','*'),
    ltrim('**abcd**','*')
from dual;
-- replace
select
    replace('abcde', 'c', '/')
from dual;

select
    birthday,
    replace(birthday,'/','-')
from student;

-- 숫자
select
    round(1.123), --반올림
    round(1.789),
    round(1.789,1),
    round(3561.4564,-1),
    trunc(1.122222), --버림
    trunc(1.161123,2),
    mod(15,4), --나머지
    ceil(123.123), --인접한 큰정수
    floor(123.123), --인접한 작은정수
    power(2,6) --2^6
from dual;

select
    rownum,
    ceil(rownum/3) 그룹번호,
    ceil(rownum/4) 팀번호,
    empno,
    ename
from emp;


--날짜
select
    sysdate, --현재 날짜
    systimestamp, --현재 날짜+ 시간
    months_between('2024-01-05','2024-03-05') --날짜 월단위 환산 계산
from dual;

select
    add_months(sysdate,-1),
    last_day(sysdate), --해당월 30일이냐 31일이냐 28일이냐 등
    next_day(sysdate,'월') --다음 월요일이 며칠이냐
from dual;

select
    sysdate,
    round(sysdate),
    trunc(sysdate),
    trunc(sysdate,'yy'), -- year 기준으로 버림. -> 26/01/01
    sysdate+3, --일 단위 계산
    last_day(sysdate)+1, --이번달 마지막날 +1 -> 다음달 첫날
    trunc(add_months(sysdate,1),'mm'), --한달 더하고 trunc -> 다음달 첫날
    last_day(add_months(sysdate,-1)) --전 달의 마지막날
from dual;