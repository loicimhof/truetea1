select r.name, r.required_seeds from rank r where 150 > r.required_seeds order by r.required_seeds desc limit 1;
