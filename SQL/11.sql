create table young_animals  as
select * , 
datediff(curdate(),date_of_birth) div 30 as age_in_month
from all_animals
WHERE date_add(date_of_birth, INTERVAL 1 YEAR) < curdate()
AND date_add(date_of_birth, INTERVAL 3 YEAR) > curdate();