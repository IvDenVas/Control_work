select * from horse_donkey
union
select id, name, date_of_birth, view_animals_id from young_animals;