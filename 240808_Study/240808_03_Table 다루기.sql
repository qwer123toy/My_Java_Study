create table if not exists pizANDchi(
	number int primary key key auto_INCREMENT,
	상호명 varchar(20) NOT NULL,
    사업자명 varchar(20) NOT NULL,
    주요메뉴 varchar(20) NOT NULL,
    메뉴명 varchar(20) NOT NULL,
    가격 int NOT NULL
);
drop table pizandchi;

insert into pizandchi (상호명, 사업자명,주요메뉴,메뉴명,가격)
values('그린피자','김그린','페퍼로니','페퍼로니',11000),	('그린피자','김그린','페퍼로니','치즈',10000),
    ('그린피자','김그린','페퍼로니','불고기',12000),('그린피자','김그린','페퍼로니','하와이안',13000),
    ('블루치킨','박블루','간장치킨','후라이드',11000), ('블루치킨','박블루','간장치킨','양념',13000),
    ('블루치킨','박블루','간장치킨','간장치킨',12500);
    
select * from pizandchi;
insert into pizandchi (상호명, 사업자명,주요메뉴,메뉴명,가격) values('그린치킨','김그린','후라이드','후라이드',10000);
UPDATE pizandchi 
SET 
    사업자명 = '김초록'
WHERE
    사업자명 = '김그린';