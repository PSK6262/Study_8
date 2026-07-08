--단일행함수
--NVL 함수 - > 값이 null이면 기본값 처리
--nvl(대상,null인경우 기본값)

select sal,
       comm,
       (sal*12) + comm,
       (sal*12) + nvl(comm, 0)
from emp;
--nvl2(대상,값있을때,없을때)

select
    nvl2(null,'있다','없다'),
    nvl2(1234,'있다','없다'),
    nvl2(1234,'1234','없다')
from dual;


select sal,
       comm,
       (sal*12) + comm,
       (sal*12) + nvl2(comm,comm,0),
       nvl2(comm , sal*12+comm , sal*12)  
from emp;


--decode(대상, 비교값 , '같다' , '다르다')
--decode(대상, 비교값 , '같다' , (decode(대상....))
--decode(대상, 비교값1 , '같다1', 비교값2 , '같다2', .... , '다르다' ) -> 마지막을 생략시 다른경우 null

select
    decode(10,10,'같다','다르다'),
    decode(10,20,'같다'),
    decode(10,10,'10이다',20,'20이다',30,'30이다','아니다')
from dual;

select name,
       deptno,
       decode(deptno, 101,'컴공',102,'전기',103,'기계',201,'물리',202,'화학',203,'수학','기타전공')
from professor;

--case 문

select grade,
       decode(grade, 1,'저학년',2,'저학년',3 ,'고학년',4,'고학년','범위외') as decode,
       case grade
           when 1 then '저학년'
           when 2 then '저학년'
           when 3 then '고학년'
           when 4 then '고학년'
           else '범위외'
       end as case ,
       case
           when grade in (1,2) then '저학년'
           when grade between 3 and 4 then '고학년'
           else '범위외'
       end as case2
from student;

select sal,
       comm,
       sal*12 + comm as 연봉1,
       sal*12 + nvl(comm,0) as 연봉2,
       sal*12 + nvl2(comm,comm,0) as 연봉3,
       nvl2(comm, sal*12+comm,sal*12) 연봉4,
       sal*12 + decode(comm, null , 0 ,comm) 연봉5,
       case comm 
            when null then (sal*12) -- 이건 안됨 comm = null , comm is null
            else (sal*12 + comm)
       end 연봉6,
       case
            when comm is null then (sal*12)
            when comm is not null then (sal*12)+comm
       end 연봉7
from emp;
