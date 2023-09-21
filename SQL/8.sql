create database people_friends;
use people_friends;
create table animals (
	id int primary key auto_increment,
    name varchar(30) not null
    );
create table type_animals (
	id int primary key auto_increment,
    name varchar(30) not null,
    animals_id int not null,
    foreign key (animals_id) references animals(id)
	on delete cascade on update cascade
    );

create table view_animals (
	id int primary key auto_increment,
    name varchar(30) not null,
    type_animals_id int not null,
    foreign key (type_animals_id) references type_animals(id)
	on delete cascade on update cascade
    );
    
create table all_animals (
	id int primary key auto_increment,
    name varchar(30) not null,
    date_of_birth date,
    view_animals_id int not null,
    foreign key (view_animals_id) references view_animals(id)
	on delete cascade on update cascade
    );
    
create table all_commands (
	id int primary key auto_increment,
    name varchar(30) not null
    );
    
create table animals_commands (
	id int primary key auto_increment,
    all_animals_id int not null,
    all_commands_id int not null,
    foreign key (all_animals_id) references all_animals(id)
	on delete cascade on update cascade,
    foreign key (all_commands_id) references all_commands(id)
	on delete cascade on update cascade
    );