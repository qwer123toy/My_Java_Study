select * from products;

-- GROUP BY : 같은 값을 가지고 있는 논리적 형태로 만들어줌
SELECT production, COUNT(*), SUM(price)
	FROM products
	GROUP BY production;
    
    
select category, count(*), avg(price)
	from products
	group by category;
    
SELECT production, COUNT(*), SUM(price)
	FROM products
	GROUP BY production
    HAVING count(*)>=2;
-- group에 대한 조건절을 작성할 때는 HAVING 절이 필요함    
