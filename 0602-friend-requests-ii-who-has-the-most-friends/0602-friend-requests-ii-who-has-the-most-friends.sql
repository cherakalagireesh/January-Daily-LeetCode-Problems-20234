/* Write your PL/SQL query statement below */

SELECT 
    id,
    num
FROM 
    (SELECT 
        id,
        COUNT(id) num
    FROM
        (SELECT 
            requester_id id
        FROM    
            RequestAccepted
        UNION ALL
        SELECT
            accepter_id id
        FROM    
            RequestAccepted) combined
    GROUP BY    
        id
    ORDER BY 
        num DESC        
    ) ranked_ids
WHERE
    ROWNUM = 1;

