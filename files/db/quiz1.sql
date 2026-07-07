//-------------퀴즈1
select name || '''s id : ' || id || ' , weight is ' || weight || 'kg' as "ID AND WEIGHT" 
from student;
//-------------퀴즈2
select ename || '(' || job || ')' || ' , ' || ename || '''' || job || ''' ' as emp
from emp;
//-------------퀴즈3
select ename || '''s sal is ' || '$' || sal as emp
from emp;
//--------------
