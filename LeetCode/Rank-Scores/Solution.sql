1# Write your MySQL query statement below
2select score,Dense_rank() over ( order by score  desc) as "rank" from Scores;