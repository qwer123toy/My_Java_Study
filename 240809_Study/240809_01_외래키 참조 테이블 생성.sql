SELECT * FROM my_db.pizandchi;

CREATE TABLE IF NOT exists COMPANY(
	NO INT PRIMARY KEY AUTO_INCREMENT
    , NAME VARCHAR(10)
    , ownerNo INT
);

CREATE TABLE IF NOT exists OWNER(
	NO INT PRIMARY KEY AUTO_INCREMENT
    , NAME VARCHAR(10)
);


insert into owner (name) values('김그린'),('박블루');
insert into COMPANY (name, ownerNo) values('그린피자',1),('박블루',2),('그린치킨',1);
insert into COMPANY (name, ownerNo) values('블루마라탕', 2);

select * from company;

select *,(select name from owner where A.ownerNo = no) AS '주인 이름' from company as A;

select *,(select count(*) from company where ownerNo = A.no) AS '가게 개수' from owner as A;
