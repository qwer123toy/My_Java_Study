select * from members;

select * from my_db.student;

select * from my_db.owner;

-- 여러 행을 집어 넣을 수 있음
insert into my_db.owner(name) select name from members;
insert into my_db.owner(name) select concat(lastname, firstname) from my_db.student;
