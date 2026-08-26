--FK 외래키

--student (profno 컬럼) -> professor (profno)

--다른 테이블(부모 테이블)의 PK값을 참조
--참조하는 테이블에 존재하는값만 사용 가능 (+ null)

--외래키 대상으로 설정된 부모테이블 입장에서 자신을 참조하는
--자식 테이블의 데이터가 존재하면 , 삭제 불가능 (설정에 따라 다름)

--외래키 삭제 조건
-- ON DELETE CASCADE; 부모데이터 삭제시 해당 값 참조하는 자식 데이터 전부 삭제
-- ON DELETE SET NULL; 부모데이터 삭제시 해당 값 참조하는 자식 데이터 NULL화

create table t_club -- T - table , V - view.. 그런 규칙이 가끔 있다
(
    id number(3) primary key,
    name varchar2(32)
);

drop table t_member;

create table t_member
(
    id number(3) primary key,
    name varchar2(32),
    --club_id references t_club(id) -- 외래키 설정
    --club_id references t_club(id) on delete cascade -- t_club의 id가 삭제되면 연관된것 전부 삭제
    club_id references t_club(id) on delete set null
);
select * from t_member;
desc t_member;

--복붙
select * from T_CLUB;

INSERT INTO T_CLUB VALUES(1, '독서');
INSERT INTO T_CLUB VALUES(2, '게임');
INSERT INTO T_CLUB VALUES(3, '등산');
INSERT INTO T_CLUB VALUES(4, '낚시');

select * from T_MEMBER;

INSERT INTO T_MEMBER VALUES(1, '이름1', 2);
INSERT INTO T_MEMBER VALUES(2, '이름2', 1);
INSERT INTO T_MEMBER VALUES(3, '이름3', 1);

select *
from t_member tm
    inner join t_club tc
        on tc.id = tm.club_id;

insert into t_member values (1,'이름4',3); -- 안된다. id가 pk인데 겹쳐서
insert into t_member values (null,'이름4',3); -- 안된다. id가 pk인데 null이라
insert into t_member values (4,'이름4',5); 
-- 안된다. club_id가 club 테이블의 id를 참조하는 외래키인데, club에서 id = 5인 값이 존재하지 않음
insert into t_member values (4,'이름4',null);
insert into t_member values (5,'이름5',3);

select * 
from t_member tm
    left outer join t_club tc
        on tm.club_id = tc.id;
        

delete 
from t_club -- 자식중에 id = 3을 참조하는게 있기 때문에 삭제할 수 없다.
where id = 3; -- 삭제 후엔 실행됨.

select * 
--delete
from t_member
where id = 5; -- 삭제 후

--cascade
select * 
--delete
from t_club 
where id = 1;

select * from t_member; -- t_club id삭제 -> t_member 이름 2,3 연쇄적 삭제

--set null
select *
--delete
from t_club -- t_club id 삭제 -> t_member에서 기존 t_club의 id를 참조하던 값들 -> null 변경
where id = 1; 

select *
from t_member;