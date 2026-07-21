--1
-- DELETE -> 테이블 값 일부~전체 삭제 / 수행 후 commit , rollback / 테이블 자체는 남음
-- TRUNCATE -> 테이블 값 전체 / auto commit / 테이블 자체는 남음
--2
create table t_member_point
(
    id number(6) ,
    seq number(6) ,
    member_id varchar2(24) not null,
    score number(3) ,
    comfirmed_date date ,
    CONSTRAINT t_members_pk PRIMARY KEY(id, seq)
);
select * from t_member_point;
--3
create sequence t_member_point_pk_seq
start with 1
increment by 1
minvalue 1
maxvalue 999999
nocycle;
--4
insert into t_member_point values (t_member_point_pk_seq.nextval
                                 , (select count(*)+1
                                    from t_member_point
                                    where 'A' = member_id)
                                 , 'A'
                                 , 70
                                 , sysdate);
insert into t_member_point values (t_member_point_pk_seq.nextval
                                 , (select count(*)+1
                                    from t_member_point
                                    where 'B' = member_id)
                                 , 'B'
                                 , 95
                                 , sysdate);
insert into t_member_point values (t_member_point_pk_seq.nextval
                                 , (select count(*)+1
                                    from t_member_point
                                    where 'C' = member_id)
                                 , 'C'
                                 , 60
                                 , sysdate);
                                 
select * from t_member_point;