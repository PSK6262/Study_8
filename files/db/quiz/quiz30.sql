--1
CREATE TABLE ONLINE_SALE (
ONLINE_SALE_ID NUMBER NOT NULL,
USER_ID NUMBER NOT NULL,
PRODUCT_ID NUMBER NOT NULL,
SALES_AMOUNT NUMBER NOT NULL,
SALES_DATE DATE NOT NULL
);

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (1, 1, 3, 2, TO_DATE('2022-02-25', 'YYYY-MM-DD'));

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (2, 1, 4, 1, TO_DATE('2022-03-01', 'YYYY-MM-DD'));

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (4, 2, 4, 2, TO_DATE('2022-03-12', 'YYYY-MM-DD'));

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (3, 1, 3, 3, TO_DATE('2022-03-31', 'YYYY-MM-DD'));

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (5, 3, 5, 1, TO_DATE('2022-04-03', 'YYYY-MM-DD'));

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (6, 2, 4, 1, TO_DATE('2022-04-06', 'YYYY-MM-DD'));

INSERT INTO ONLINE_SALE (ONLINE_SALE_ID, USER_ID, PRODUCT_ID, SALES_AMOUNT, SALES_DATE)
VALUES (2, 1, 4, 2, TO_DATE('2022-05-11', 'YYYY-MM-DD'));

select * from online_sale;

--Online_sale 테이블에서 동일한 회원이 동일 상품을 재구매한 데이터
--재구매한 회원 ID와 재구매한 상품ID를 출력 , 결과는 ID기준 오름차순 , 같다면 상품ID기준 내림차순
--select os1.user_id , os1.product_id
--from online_sale os1
--where (os1.user_id, os1.product_id) in (select os2.user_id, os2.product_id
--                                        from online_sale os2
--                                        where os1.user_id = os2.user_id 
--                                        and os1.product_id = os2.product_id
--                                        and os1.rowid != os2.rowid)
--group by (os1.user_id , os1.product_id)
--order by os1.user_id , os1.product_id desc;

select user_id , product_id
from online_sale
group by user_id , product_id
having count(*) > 1
order by user_id , product_id desc;