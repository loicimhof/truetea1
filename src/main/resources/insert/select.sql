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
