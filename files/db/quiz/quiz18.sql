select to_char(to_date(pa.p_date),'yyyy-mm-dd') as 판매일자
     , pa.p_code as 상품코드
     , pr.p_name as 상품명
     , to_char(pr.p_price) as 상품가
     , pa.p_qty as 구매수량
     , to_char(pa.p_total,'999,999') as 총금액
     , to_char(pa.p_total*100,'999,999,999') as 적립포인트
     , case
           when to_char(to_date(pa.p_date),'mm-dd') = '01-01'
               then to_char(pa.p_total*200,'999,999,999')
           else to_char(pa.p_total*100,'999,999,999')
       end as 새해2배적립이벤트
     , g.gname as 사은품명
     , to_char(g.g_start,'999,999') as 포인트START
     , to_char(g.g_end,'999,999') as 포인트END
from panmae pa
    inner join product pr
        on pa.p_code = pr.p_code
    inner join gift g
        on case
           when to_char(to_date(pa.p_date),'mm-dd') = '01-01'
               then pa.p_total*200
           else pa.p_total*100
        end 
           between g.g_start and g.g_end
order by pa.p_date;

--with
with current_point as(
    select rowid as rid
         , case 
               when to_char(to_date(p_date),'mm-dd') = '01-01'
                   then p_total*200
               else p_total*100
           end as point
    from panmae
)
select to_char(to_date(pa.p_date),'yyyy-mm-dd') as 판매일자
     , pa.p_code as 상품코드
     , pr.p_name as 상품명
     , to_char(pr.p_price,'999,999') as 상품가
     , pa.p_qty as 구매수량
     , to_char(pa.p_total,'999,999') as 총금액
     , to_char(pa.p_total * 100,'999,999,999') as 적립포인트
     , to_char(cp.point,'999,999') as 새해2배적립이벤트
     , g.gname as 사은품명
     , to_char(g.g_start,'999,999') as 포인트START
     , to_char(g.g_end,'999,999') as 포인트END
from panmae pa
    inner join current_point cp
        on cp.rid = pa.rowid
    inner join product pr
        on pa.p_code = pr.p_code
    inner join gift g
        on cp.point between g.g_start and g.g_end
order by pa.p_date;