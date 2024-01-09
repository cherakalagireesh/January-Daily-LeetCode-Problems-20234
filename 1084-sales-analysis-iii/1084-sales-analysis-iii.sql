/* Write your PL/SQL query statement below */

(SELECT 
    p.product_id, p.product_name
FROM    
    Product p JOIN Sales s
ON
    (p.product_id = s.product_id)   
WHERE 
    s.sale_date BETWEEN '2019-01-01' AND '2019-03-31'
GROUP BY 
    p.product_id,p.product_name)

MINUS

(SELECT 
    p.product_id, p.product_name
FROM    
    Product p JOIN Sales s
ON
    (p.product_id = s.product_id)   
WHERE 
    s.sale_date NOT BETWEEN '2019-01-01' AND '2019-03-31'
GROUP BY 
    p.product_id,p.product_name);

