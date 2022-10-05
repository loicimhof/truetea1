-- into rank - complete

insert into rank(id, discount, name, required_seeds, weight) VALUES ('eb028170-2ead-11ed-a261-0242ac120001', 1.00, 'bronze', 0, 1);
insert into rank(id, discount, name, required_seeds, weight) VALUES ('eb028170-2ead-11ed-a261-0242ac120002', 0.96, 'silver', 20, 2);
insert into rank(id, discount, name, required_seeds, weight) VALUES ('eb028170-2ead-11ed-a261-0242ac120003', 0.93, 'gold', 60, 3);
insert into rank(id, discount, name, required_seeds, weight) VALUES ('eb028170-2ead-11ed-a261-0242ac120004', 0.91, 'gold', 140, 4);
insert into rank(id, discount, name, required_seeds, weight) VALUES ('eb028170-2ead-11ed-a261-0242ac120005', 0.91, 'gold', 300, 5);



-- into teatype - complete
insert into tea_type(id, name, req_age, req_rank_weight) values ('ab028170-2ead-11ed-a261-0242ac120001', 'white', 0, 0);
insert into tea_type(id, name, req_age, req_rank_weight) values ('ab028170-2ead-11ed-a261-0242ac120002', 'green', 0, 0);
insert into tea_type(id, name, req_age, req_rank_weight) values ('ab028170-2ead-11ed-a261-0242ac120003', 'matscha', 0, 0);
insert into tea_type(id, name, req_age, req_rank_weight) values ('ab028170-2ead-11ed-a261-0242ac120004', 'yellow', 0, 0);
insert into tea_type(id, name, req_age, req_rank_weight) values ('ab028170-2ead-11ed-a261-0242ac120005', 'oolong', 0, 4);
insert into tea_type(id, name, req_age, req_rank_weight) values ('ab028170-2ead-11ed-a261-0242ac120006', 'black', 0, 0);
insert into tea_type(id, name, req_age, req_rank_weight) values ('ab028170-2ead-11ed-a261-0242ac120007', 'raw puerh', 0, 4);
insert into tea_type(id, name, req_age, req_rank_weight) values ('ab028170-2ead-11ed-a261-0242ac120008', 'ripened', 0, 0);
insert into tea_type(id, name, req_age, req_rank_weight) values ('ab028170-2ead-11ed-a261-0242ac120009', 'tisanes', 0, 0);
insert into tea_type(id, name, req_age, req_rank_weight) values ('ab028170-2ead-11ed-a261-0242ac120010', 'medicinal herbs', 18, 0);



insert into country(id, name) VALUES ('ab028170-2ead-11ed-a261-0242ac120001', 'china');
insert into country(id, name) VALUES ('ab028170-2ead-11ed-a261-0242ac120002', 'taiwan');
insert into country(id, name) VALUES ('ab028170-2ead-11ed-a261-0242ac120003', 'japan');
insert into country(id, name) VALUES ('ab028170-2ead-11ed-a261-0242ac120004', 'india');


--into tea - incomplete


-- Key auf Tea??? funzt nicht?
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120011', 11.0, 'MT', '2022.01.01', 'icetea peach', 'ab028170-2ead-11ed-a261-0242ac120003', 13.0, 'ab028170-2ead-11ed-a261-0242ac120001', 10);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120012', 14.5, 'MT', '2022.01.01', 'coca cola', 'ab028170-2ead-11ed-a261-0242ac120001', 16.0, 'ab028170-2ead-11ed-a261-0242ac120001', 10);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120013', 17.0, 'MT', '2022.01.01', 'pepsi', 'ab028170-2ead-11ed-a261-0242ac120001', 23.0, 'ab028170-2ead-11ed-a261-0242ac120002', 10);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120014', 9.0, 'MT', '2022.01.01', 'water', 'ab028170-2ead-11ed-a261-0242ac120001', 30.0, 'ab028170-2ead-11ed-a261-0242ac120002', 10);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120015', 21.0, 'MT', '2022.01.01', 'fanta', 'ab028170-2ead-11ed-a261-0242ac120003', 13.0, 'ab028170-2ead-11ed-a261-0242ac120003', 10);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120016', 36.0, 'MT', '2022.01.01', 'sprite', 'ab028170-2ead-11ed-a261-0242ac120002', 13.0, 'ab028170-2ead-11ed-a261-0242ac120003', 20);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120017', 8.2, 'MT', '2022.01.01', 'coffee', 'ab028170-2ead-11ed-a261-0242ac120001', 13.0, 'ab028170-2ead-11ed-a261-0242ac120004', 20);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120018', 23.0, 'MT', '2022.01.01', 'icetea lemon', 'ab028170-2ead-11ed-a261-0242ac120002', 36.0, 'ab028170-2ead-11ed-a261-0242ac120004', 20);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120019', 18.4, 'MT', '2022.01.01', 'testtea', 'ab028170-2ead-11ed-a261-0242ac120001', 39.0, 'ab028170-2ead-11ed-a261-0242ac120005', 20);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120020', 13.0, 'MT', '2022.01.01', 'testtea', 'ab028170-2ead-11ed-a261-0242ac120002', 21.0, 'ab028170-2ead-11ed-a261-0242ac120005', 20);

insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120021', 34.0, 'MT', '2022.01.01', 'testtea', 'ab028170-2ead-11ed-a261-0242ac120001', 32.0, 'ab028170-2ead-11ed-a261-0242ac120006', 50);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120022', 13.0, 'MT', '2022.01.01', 'testtea', 'ab028170-2ead-11ed-a261-0242ac120004', 25.0, 'ab028170-2ead-11ed-a261-0242ac120006', 50);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120023', 19.0, 'MT', '2022.01.01', 'testtea', 'ab028170-2ead-11ed-a261-0242ac120003', 45.0, 'ab028170-2ead-11ed-a261-0242ac120007', 50);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120024', 10.0, 'MT', '2022.01.01', 'testtea', 'ab028170-2ead-11ed-a261-0242ac120001', 27.0, 'ab028170-2ead-11ed-a261-0242ac120007', 50);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120025', 12.0, 'MT', '2022.01.01', 'testtea', 'ab028170-2ead-11ed-a261-0242ac120002', 19.0, 'ab028170-2ead-11ed-a261-0242ac120008', 50);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120026', 16.0, 'MT', '2022.01.01', 'testtea', 'ab028170-2ead-11ed-a261-0242ac120001', 29.0, 'ab028170-2ead-11ed-a261-0242ac120008', 100);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120027', 24.0, 'MT', '2022.01.01', 'testtea', 'ab028170-2ead-11ed-a261-0242ac120004', 45.0, 'ab028170-2ead-11ed-a261-0242ac120009', 100);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120028', 11.0, 'MT', '2022.01.01', 'testtea', 'ab028170-2ead-11ed-a261-0242ac120001', 34.0, 'ab028170-2ead-11ed-a261-0242ac120009', 100);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120029', 13.0, 'MT', '2022.01.01', 'testtea', 'ab028170-2ead-11ed-a261-0242ac120002', 22.0, 'ab028170-2ead-11ed-a261-0242ac120010', 100);
insert into tea(id, buying_price, description, harvest_date, name, origin, selling_price, tea_type_id, stock) VALUES ('ab028170-2ead-11ed-a261-0242ac120030', 6.0, 'MT', '2022.01.01', 'testtea', 'ab028170-2ead-11ed-a261-0242ac120001', 13.0, 'ab028170-2ead-11ed-a261-0242ac120010', 100);


insert into role(id, name) VALUES ('ab028170-2ead-11ed-a261-0242ac120001', 'ROLE_ADMIN');
insert into role(id, name) VALUES ('ab028170-2ead-11ed-a261-0242ac120002', 'ROLE_USER');
insert into role(id, name) VALUES ('ab028170-2ead-11ed-a261-0242ac120003', 'ROLE_DEV');


insert into authority(id, name) VALUES ('ab028170-2ead-11ed-a261-0242ac120001', 'CAN_SEE_STATISTICS');
insert into authority(id, name) VALUES ('ab028170-2ead-11ed-a261-0242ac120002', 'bsp 2');
insert into authority(id, name) VALUES ('ab028170-2ead-11ed-a261-0242ac120003', 'bsp 3');


insert into role_authority(role_id, authority_id) VALUES ('ab028170-2ead-11ed-a261-0242ac120001', 'ab028170-2ead-11ed-a261-0242ac120001');
insert into role_authority(role_id, authority_id) VALUES ('ab028170-2ead-11ed-a261-0242ac120001', 'ab028170-2ead-11ed-a261-0242ac120002');
insert into role_authority(role_id, authority_id) VALUES ('ab028170-2ead-11ed-a261-0242ac120001', 'ab028170-2ead-11ed-a261-0242ac120003');

insert into role_authority(role_id, authority_id) VALUES ('ab028170-2ead-11ed-a261-0242ac120002', 'ab028170-2ead-11ed-a261-0242ac120001');

