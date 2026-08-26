select empno as 사번,
       name as 이름, 
       birthday as 생년월일, 
       hobby as 취미,
       pay as 급여 , 
       pay*1.5 as 성과급,
       substr(emp_type,1,instr(emp_type,' '))||'family' as "직원 분류",
       tel,
       case
           when pay between 35000001 and 45000000 then '하'
           when pay between 45000001 and 60000000 then '중'
           when pay > 60000001 then '상'
       else '화이팅'
    end as 급여수준
from emp2
where substr(to_char(birthday,'yy'),1,1) = '7' 
      and substr(tel,1,instr(tel,')')-1) in ('02','031');