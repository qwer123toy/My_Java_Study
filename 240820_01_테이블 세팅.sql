select * from picture;

SELECT * FROM members;
select * from subscribe;
select * from base64;

alter table members add column profileNo INT DEFAULT 1;
alter table members add foreign key (profileNo) references base64(id);

select A.*,from_base64(B.data) from members A LEFT JOIN base64 B on A.profileNo = B.id;
select * from members A LEFT JOIN subscribe B on A.id = B.memberId;
select B.id from members A LEFT JOIN base64 B on A.profileNo = B.id where A.id = 3;

