/* Write your PL/SQL query statement below */


WITH cte  As (
SELECT 
    person_name
FROM 
    (SELECT
        person_id,
        person_name, 
        SUM(weight) OVER (ORDER BY turn) total
    FROM
        Queue);
WHERE
    total <= 1000
ORDER BY 
    total DESC)

SELECT
    person_name
FROM 
    cte
WHERE 
    ROWNUM = 1;








