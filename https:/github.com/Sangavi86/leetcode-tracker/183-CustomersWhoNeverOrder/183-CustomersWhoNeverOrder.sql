-- Last updated: 8/14/2026, 10:33:35 AM
# Write your MySQL query statement below
SELECT name as Customers
from Customers
WHERE id NOT IN(SELECT customerId FROM Orders) 