-- Last updated: 8/4/2026, 5:56:36 PM
# Write your MySQL query statement below
SELECT * 
FROM Cinema
WHERE id %2=1
AND description !='boring'
ORDER BY rating DESC;