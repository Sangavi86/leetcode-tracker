-- Last updated: 8/3/2026, 2:43:46 PM
# Write your MySQL query statement below
SELECT name 
FROM Customer
WHERE referee_id != 2 
OR referee_id IS NULL