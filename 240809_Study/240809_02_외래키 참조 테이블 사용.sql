create table if not exists CompanyMenu(
	companyNo int,
    menuNo INT
);

create table if not exists Menu(
	no INT primary key auto_increment
    , name varchar(10)
    , price int
);

insert into menu (name,price) 
	values('페퍼로니',11000),('치즈',10000);

select * from menu;

insert into companymenu (companyno, menuno)
values(1,2),(1,3),(1,4),(2,5),(2,6),(2,7),(3,8);

SELECT 
    *
FROM
    companymenu;

-- 상호명, 메뉴개수, 메뉴 가격의 합

select (select name from company where no = A.companyNo) AS '상호명',
count(*) AS '메뉴 개수'
from companymenu AS A where companyno=1;

