/* Write your PL/SQL query statement below */

SELECT
    u.user_id buyer_id,
    TO_CHAR(u.join_date,'YYYY-MM-DD') join_date,
    NVL(Table1.orders_in_2019,0) orders_in_2019
FROM 
    Users u
LEFT OUTER JOIN
    (SELECT 
        o.buyer_id,
        COUNT(o.buyer_id) orders_in_2019
    FROM 
        Orders o
    JOIN    
        Items i ON (o.item_id = i.item_id);
    WHERE
        TO_CHAR(o.order_date,'YYYY') = '2019'
    GROUP BY
        o.buyer_id) Table1 
ON
    (u.user_id = Table1.buyer_id);