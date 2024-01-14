/* Write your PL/SQL query statement below */


(SELECT  
    'Low Salary' category,
    CASE 
        WHEN COUNT(account_id) = 0 THEN  0
        ELSE
            COUNT(account_id) 
    END
    accounts_count
FROM 
    Accounts
WHERE
    income < 20000);
UNION ALL
(SELECT  
    'Average Salary' category,
    CASE 
        WHEN COUNT(account_id) = 0 THEN  0
        ELSE
            COUNT(account_id) 
    END
    accounts_count
FROM 
    Accounts
WHERE
    income BETWEEN 20000 AND 50000);
UNION ALL
(SELECT  
    'High Salary' category,
    CASE 
        WHEN COUNT(account_id) = 0 THEN  0
        ELSE
            COUNT(account_id) 
    END
    accounts_count
FROM 
    Accounts
WHERE
    income > 50000);