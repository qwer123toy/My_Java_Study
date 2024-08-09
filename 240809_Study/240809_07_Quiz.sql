select * from greenmember;
select * from products;

create table orderProduct(
	no int primary key auto_increment,
    orderdate varchar(15)
);

insert into orderProduct(orderdate) values ('2024-08-09'),('2024-08-10'),('2024-08-11');

create table orderFK(
	orderNumber int,
    orderNameID int,
    orderProducts int,
    orderCount int,
    foreign key(orderNumber) references orderProduct(no),
    foreign key(orderNameID) references greenmember(mem_no),
    foreign key(orderProducts) references products(no)
);
    
insert into orderFK values (1,1,1,1),(1,1,5,2),(2,2,2,3),(3,1,3,10),(3,1,2,1);
select * from orderfk;

select * from orderFK A 
	left join orderProduct B on A.orderNumber = B.no
	left join greenmember C on  A.orderNameID = C.mem_no
    left join products D on  A.orderProducts = D.no;


select B.no, B.orderdate, C.name, C.PHONENUMBER, 
	concat(D.no, " ", D.production, " ", D.category, " ", A.orderCount, "개")	 
    AS '주문상품' from orderFK A 
	left join orderProduct B on A.orderNumber = B.no
	left join greenmember C on  A.orderNameID = C.mem_no
    left join products D on  A.orderProducts = D.no;
    
SELECT 
    B.no, 
    B.orderdate, 
    C.name, 
    C.PHONENUMBER, 
    GROUP_CONCAT(CONCAT(D.no, " ", D.production, " ", D.category, " ", A.orderCount, "개") 
    ORDER BY D.no SEPARATOR ', ') AS '주문상품'
FROM 
    orderFK A 
    LEFT JOIN orderProduct B ON A.orderNumber = B.no
    LEFT JOIN greenmember C ON A.orderNameID = C.mem_no
    LEFT JOIN products D ON A.orderProducts = D.no 
GROUP BY 
    B.no, B.orderdate, C.name, C.PHONENUMBER;
