--타입변환

--to_char to_date to_number
-- 문자 날짜 숫자로

select 2+2 from dual;
select 2+'2' from dual; --자동형변환 (묵시적)
select 2 || '2' from dual;
select 2 + to_number('2') from dual; --명시적

select
    to_char(12341),
    to_char(123.503),
    sysdate,
    to_char(sysdate,'yyyy'),
    to_char(sysdate,'yy'),
    to_char(sysdate,'mm'),
    to_char(sysdate,'dd')
from dual;

select
    name 이름,
    substr(jumin,1,2) 년,
    substr(jumin,3,2) 월,
    substr(jumin,5,2) 일
from student;
    
    
select jumin,
       birthday,
       to_char(birthday,'yy') 년,
       to_char(birthday,'mm') 월,
       to_char(birthday,'dd') 일,
       to_char(birthday,'yyyy-mm-dd')
from student;

select sysdate,
       to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss'),
       systimestamp
from dual;

select to_number('12313'),
       to_number('123.343') --숫자로 바꿀 수 없는 것 -> 오류
from dual;

select to_char(1234,'9999999'), --9 개수만큼 자리차지 , 0이면 0붙여서 자리차지
       to_char(1234,'0999999'),
       to_char(1234,'9999.99'), 
       to_char(12345678,'999,999,999')
from dual;

select '2025-12-02' || 3, 
       to_date('2025-12-02') + 3, -- 둘다 가능 / - 
       to_date('2025/12/02') + 3,
       to_date('20251202') + 3, -- 이것도 가능
       LAST_DAY('2024-02-03'),
       to_date('2025-03-04','yyyy-mm-dd'),
       to_date('25/03/04','yy/mm/dd')
from dual;


SELECT '2026-03-23',
       SUBSTR('2026-03-23', 6, 2),
       TO_CHAR( TO_DATE('2026-03-23'), 'MM') as 월추출
FROM dual;