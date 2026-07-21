--1
create table T_ITEM_LIST
(
    no number(6) primary key,
    item_name varchar2(24) not null,
    price number(6),
    create_date date
);
select * from t_item_list;
--2
create sequence T_ITEM_LIST_PK_SEQ
start with 1
increment by 1
minvalue 1
maxvalue 999999
nocycle;
--3
select T_ITEM_LIST_PK_SEQ.nextval from dual;
--4
insert into T_ITEM_LIST values (
            T_ITEM_LIST_PK_SEQ.nextval+1 ,
            '짜장면' ,
            8000 ,
            sysdate );

select * from T_ITEM_LIST;
