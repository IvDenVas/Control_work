create table horse_donkey as
select * from all_animals where view_animals_id = 4
union
select * from all_animals where view_animals_id = 6;