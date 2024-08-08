create table if not exists products(
-- 테이블 생성 시 기본키 설정 후 자동으로 증가하도록 설정
no INT PRImary key key auto_INCREMENT
, production varchar(20)
, category varchar(20)
, price int
);
drop table products;
insert into products (production, category,price)
	values('애플','노트북',150),('삼성','스마트폰',100),
    ('애플','스마트폰',120),('삼성','노트북',140),('LG','노트북',130);

-- 명시적으로 넣어줄 수도 있음
insert into products (no, production, category,price)
		values(20,'샤오미','노트북',90);

-- 명시적으로 넣어준 값 이후부터 증가하게 됨
insert into products (production, category,price)
		values('레노버','노트북',100);
        
select * from products;

insert into products (no, production, category,price)
		values(8,'샤오미','워치',50);
        
insert into products (production, category,price)
		values('레노버','PC',150);