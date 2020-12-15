use green;

-- main tables cleanup
drop table if exists recordings;
drop table if exists stations;


create table stations(
	station_id integer primary key auto_increment,
    station_code integer,
    latitude decimal(5,3),
    longitude decimal(6,3)
);

insert into stations (station_id, station_code, latitude, longitude) values ('1', '28029008', '45.100', '120.100');
insert into stations (station_id, station_code, latitude, longitude) values ('2', '28029018', '45.200', '120.200');
insert into stations (station_id, station_code, latitude, longitude) values ('3', '28029024', '45.300', '120.300');
insert into stations (station_id, station_code, latitude, longitude) values ('4', '28029055', '45.400', '120.400');
insert into stations (station_id, station_code, latitude, longitude) values ('5', '28029056', '45.500', '120.500');





    