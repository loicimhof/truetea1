select r.name, r.required_seeds from rank r where 150 > r.required_seeds order by r.required_seeds desc limit 1;



/*
8) Ein Benutzer muss einsehen können, wie viele Teevariationen er pro
Teesorte in der Vergangenheit bestellt hatte

- principal als Parameter
- where user = principal (u.id = principal.id? => dann müsste der Parameter schon eine UUID sein)
- user => order => orderposition => tea => teatype
 */

/* normal */
 select u.first_name, op.amount, t.name, tt.name from users u, orders o, order_positions op, tea t, tea_type tt where u.id = o.users_id and o.id = op.order_id and op.tea_id = t.id and t.tea_type_id = tt.id;

/* counte odr so */
select count(t.name), tt.name from users u, orders o, order_positions op, tea t, tea_type tt where u.id = o.users_id and o.id = op.order_id and op.tea_id = t.id and t.tea_type_id = tt.id group by tt.name;


select sum(op.amount), tt.name as category, t.name as tea from users u, orders o, order_positions op, tea t, tea_type tt where u.id = o.users_id and o.id = op.order_id and op.tea_id = t.id and t.tea_type_id = tt.id group by tt.name, t.name;


select tt.req_rank_weight from tea_type tt, users u where u.rank_id = tt.id and u.id = :principal;

select r.req_age from rank r, users u where u.rank_id = r.id and u.id = :principal;


-- v2.3 not used anymore
select u.first_name, o.id, op.id, op.amount from users u, orders o, order_positions op where u.id = o.users_id and o.id = op.order_id;

-- v2.3 not used anymore

select u.first_name, sum(op.amount) as teas from users u, orders o, order_positions op where u.id = o.users_id and o.id = op.order_id group by u.first_name order by teas desc;

-- v2.3 - Get user with most bought teas
select u.first_name from users u, orders o, order_positions op where u.id = o.users_id and o.id = op.order_id group by u.first_name order by sum(op.amount) desc limit 1;


select u.* from users u, orders o, order_positions op where u.id = o.users_id and o.id = op.order_id group by u.first_name, u.id, u.created_at, u.modified_at, birth_date, email, last_name, password, seeds, u.created_by, u.last_modified_by, rank_id order by sum(op.amount) desc limit 1;
