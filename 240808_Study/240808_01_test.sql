 
CREATE TABLE IF NOT EXISTS Subway (
    code int,
    city VARCHAR(20),
    date VARCHAR(11),
    cardFee INT,
    moneyFee INT
);
desc Subway;
use my_db;
insert into Subway values (1, '서울','2024-06-30',1400,1500),
	(2, '부산','2024-06-30',1600,1700),
    (3, '대구','2024-06-30',1500,1700),
	(4, '인천','2024-06-30',1400,1500),
    (5, '광주','2024-06-30',1250,1400),
    (6, '대전','2024-06-30',1550,1700);

select * from subway;
select *,moneyfee-cardfee as "가격차" from subway order by "가격차";
drop table subway;