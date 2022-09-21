select r.name, r.required_seeds from users u, rank r where u.seeds > r.required_seeds order by seeds limit 1;
