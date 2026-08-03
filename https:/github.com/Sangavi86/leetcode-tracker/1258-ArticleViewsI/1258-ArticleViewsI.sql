-- Last updated: 8/3/2026, 3:14:00 PM
# Write your MySQL query statement below
SELECT DISTINCT author_id AS id
FROM Views
WHERE author_id=viewer_id
ORDER BY id;