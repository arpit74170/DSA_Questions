1# Write your MySQL query statement below
2select email from Person group by email  having count(email)>1;