-- Last updated: 7/23/2026, 2:55:35 PM
# Write your MySQL query statement below
SELECT email AS Email
FROM Person
GROUP BY email
HAVING COUNT(email) > 1;