CREATE TABLE IF NOT EXISTS `members` (
	id INT PRIMARY KEY AUTO_INCREMENT
    , name VARCHAR(10) NOT NULL
    , phoneNumber VARCHAR(10) NOT NULL
);

CREATE TABLE IF NOT EXISTS `products` (
	no INT PRIMARY KEY AUTO_INCREMENT
    , production VARCHAR(10) NOT NULL
    , category VARCHAR(10) NOT NULL
    , price Int NOT NULL
);

CREATE TABLE IF NOT EXISTS `ORDERS` (
	id INT PRIMARY KEY AUTO_INCREMENT
    , data CHAR(10) NOT NULL
    , memberId INT NOT NULL
    , FOREIGN KEY (`memberId`) REFERENCES members (`id`)
);

CREATE TABLE IF NOT EXISTS `OrderDetail` (
	orderId INT NOT NULL
    , productId INT NOT NULL
    , quantity INT NOT NULL
    , PRIMARY KEY (`orderId`, `productId`)
    , FOREIGN KEY (`orderId`) REFERENCES `orders` (`id`)
    , FOREIGN KEY (`productId`) REFERENCES `products` (`no`)
);
select * from my_db.products;
select * from products;
INSERT INTO orders (data, memberId)
	VALUES ('2024-08-09', (SELECT id FROM members WHERE name = 'TOM'));
    
INSERT INTO orders (data, memberId)
	VALUES ('2024-08-10', (SELECT id FROM members WHERE name = 'BRAD'));
    
INSERT INTO orders (data, memberId)
	VALUES ('2024-08-11', (SELECT id FROM members WHERE name = 'TOM'));

SELECT * FROM orders A
	LEFT JOIN members B ON A.memberId = B.id;

INSERT INTO OrderDetail (orderId, productId, quantity)
	VALUES (1, (SELECT no FROM products WHERE production = '애플' AND category = '노트북'), 1);
    
    INSERT INTO OrderDetail (orderId, productId, quantity)
	VALUES (1, (SELECT no FROM products WHERE production = 'LG' AND category = '노트북'), 2);
    
    INSERT INTO OrderDetail (orderId, productId, quantity)
	VALUES (2, (SELECT no FROM products WHERE production = '삼성' AND category = '스마트폰'), 3);
    
    INSERT INTO OrderDetail (orderId, productId, quantity)
	VALUES (3, (SELECT no FROM products WHERE production = '애플' AND category = '스마트폰'), 10);
    
    INSERT INTO OrderDetail (orderId, productId, quantity)
	VALUES (3, (SELECT no FROM products WHERE production = '삼성' AND category = '스마트폰'), 1);
    
SELECT B.id, `data`, M.name, M.phoneNumber
	, C.no, C.production, C.category, A.quantity
	FROM OrderDetail A
	LEFT JOIN Orders B ON A.orderId = B.id
    Left Join members M ON B.memberId = M.id
    LEFT JOIN products C On A.productId = C.no;

-- 두 행을 하나로 합치고 싶음
select production, count(*), sum(price) from products
	where production ="애플"
		UNION -- UNION을 통해 한번에 출력 가능
select production, count(*), sum(price) from products
	where production ="삼성";

select 1, 2, 3
	Union
select 4, 5, 6;

select 1, 2, 3, 4 AS '4번째 열'
	Union
select 4, 5, 6;

SELECT 1, 1, 1 
	UNION 
SELECT 2, 2, 2 
	UNION 
SELECT 3, 3, 3 
	UNION ALL
SELECT 1, 1, 1;