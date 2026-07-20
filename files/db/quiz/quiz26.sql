CREATE TABLE TABLE_DATA_1
(
no number(10),
create_date DATE
);

CREATE TABLE TABLE_DATA_2
(
no number(10),
create_date DATE
);

CREATE TABLE TABLE_COLC
(
std_date DATE,
CHECK_DATA1 VARCHAR2(6),
CHECK_DATA2 VARCHAR2(6)
);

INSERT INTO TABLE_DATA_1 VALUES (1, '2023-04-01');
INSERT INTO TABLE_DATA_1 VALUES (2, '2023-04-02');
INSERT INTO TABLE_DATA_1 VALUES (3, '2023-04-03');
INSERT INTO TABLE_DATA_1 VALUES (4, '2023-04-04');

INSERT INTO TABLE_DATA_2 VALUES (1, '2023-04-02');
INSERT INTO TABLE_DATA_2 VALUES (2, '2023-04-03');
INSERT INTO TABLE_DATA_2 VALUES (3, '2023-04-04');
INSERT INTO TABLE_DATA_2 VALUES (4, '2023-04-05');

select * from table_data_1;
select * from table_data_2;

merge into table_colc t
using table_data_1 d
on (t.std_date = d.create_date)
when matched then
    update set t.check_data1 = 'Y'
when not matched then
    insert values (d.create_date,'Y','N');
    
merge into table_colc t
using table_data_2 d
on (t.std_date = d.create_date)
when matched then
    update set t.check_data2 = 'Y'
when not matched then
    insert values (d.create_date,'N','Y');
    
select *
from table_colc
order by std_date;