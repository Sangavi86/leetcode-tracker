-- Last updated: 8/22/2026, 12:16:14 PM
# Write your MySQL query statement below
SELECT name 
from SalesPerson 
where sales_id not in(
    select sales_id
    from orders
        where com_id=(
            select com_id
            from company 
            where name='RED'
        )
)