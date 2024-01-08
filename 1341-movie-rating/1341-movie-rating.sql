SELECT results
FROM     
    (SELECT u.name results
     FROM Users u
     JOIN MovieRating m ON u.user_id = m.user_id
     GROUP BY u.user_id, u.name
     ORDER BY COUNT(*) DESC, u.name ASC)
WHERE ROWNUM <= 1
UNION ALL
SELECT results
FROM
    (SELECT m1.title results
     FROM Movies m1
     JOIN MovieRating m2 ON m1.movie_id = m2.movie_id
     WHERE EXTRACT(MONTH FROM m2.created_at) = 2 AND EXTRACT(YEAR FROM m2.created_at) = 2020
     GROUP BY m2.movie_id, m1.title
     ORDER BY AVG(m2.rating) DESC, m1.title ASC)
WHERE ROWNUM <= 1;
