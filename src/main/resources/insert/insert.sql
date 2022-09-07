insert into users(id, email, first_name, last_name, password)
values ('69a069b8-2df8-11ed-a261-0242ac120002', 'richi@ny.com', 'Richi', 'Staub', '$2a$10$PywC0M1Jx4D4X7abwQT1UOLmp8eh9f1Tclf9Io1kp7lcChoP4yme2');
-- // password = gibb //


-- into rank - complete
insert into rank(id, discount, name, required_seeds) values ('eb028170-2ead-11ed-a261-0242ac120002', 1.00, 'bronze', 0);
insert into rank(id, discount, name, required_seeds) values ('eb028170-2ead-11ed-a261-0242ac120003', 0.96, 'silver', 20);
insert into rank(id, discount, name, required_seeds) values ('eb028170-2ead-11ed-a261-0242ac120004', 0.93, 'gold', 60);
insert into rank(id, discount, name, required_seeds) values ('eb028170-2ead-11ed-a261-0242ac120005', 0.91, 'platinum', 140);
insert into rank(id, discount, name, required_seeds) values ('eb028170-2ead-11ed-a261-0242ac120006', 0.90, 'diamond', 300);


-- into teatype - complete
insert into tea_type(id, name) values ('ab028170-2ead-11ed-a261-0242ac120001', 'white');
insert into tea_type(id, name) values ('ab028170-2ead-11ed-a261-0242ac120002', 'green');
insert into tea_type(id, name) values ('ab028170-2ead-11ed-a261-0242ac120003', 'matscha');
insert into tea_type(id, name) values ('ab028170-2ead-11ed-a261-0242ac120004', 'yellow');
insert into tea_type(id, name) values ('ab028170-2ead-11ed-a261-0242ac120005', 'oolong');
insert into tea_type(id, name) values ('ab028170-2ead-11ed-a261-0242ac120006', 'black');
insert into tea_type(id, name) values ('ab028170-2ead-11ed-a261-0242ac120007', 'raw puerh');
insert into tea_type(id, name) values ('ab028170-2ead-11ed-a261-0242ac120008', 'ripened');
insert into tea_type(id, name) values ('ab028170-2ead-11ed-a261-0242ac120009', 'tisanes');
insert into tea_type(id, name) values ('ab028170-2ead-11ed-a261-0242ac120010', 'medicinal herbs');





--into tea - incomplete
insert into tea(id, harvest_date, name, description, origin, buying_price, selling_price)
values ('ab028170-2ead-11ed-a261-0242ac120010', 2022-01-01, 'tea123', 'drink', 'india', 10.00, 12.00);






