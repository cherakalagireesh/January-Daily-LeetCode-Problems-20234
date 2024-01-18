/* Write your PL/SQL query statement below */


SELECT 
    Department,
    Employee,
    Salary
FROM
    (SELECT
        d.name Department,
        e.name Employee,    
        e.salary,
        DENSE_RANK() OVER(PARTITION BY e.departmentId ORDER BY e.salary DESC) rank
    FROM 
        Employee e
    JOIN    
        Department d ON (e.departmentId = d.id));
WHERE
    rank <= 3;