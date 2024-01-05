/* Write your PL/SQL query statement below */


SELECT 
    e1.employee_id,
    e1.name,
    COUNT(e1.employee_id) reports_count,
    ROUND(AVG(e2.age)) average_age
FROM 
    Employees e1 JOIN Employees e2
ON
    (e1.employee_id = e2.reports_to)
GROUP BY 
    e1.employee_id, e1.name
HAVING 
    COUNT(e1.employee_id) >= 1
ORDER BY 
    e1.employee_id;
