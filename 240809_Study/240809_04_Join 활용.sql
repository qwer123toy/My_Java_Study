insert into hobbys (name) values ('음악감상');

select * from membershobbys;
insert into membershobbys values(1,1);

select * from company;
select * from owner;

-- cross Join
select * from company,owner;
use my_db;

select * from company As A,owner AS B where A.ownerNo = b.no;

-- left outer join  겹치는 값이 없더라도 왼쪽 테이블의 모든 값이 무조건 출력됨
select * from company As A 
	LEFT OUTER JOIN owner AS B ON A.OwnerNo = B.no;
    
-- right outer join 겹치는 값이 없더라도 오른쪽 테이블의 모든 값이 무조건 출력됨
select * from company As A 
	RIGHT OUTER JOIN owner AS B ON A.OwnerNo = B.no;

-- inner join 두 테이블 중 겹치는 값(결합이 일어나는 값)만 출력됨
select * from company As A 
	INNER JOIN owner AS B ON A.OwnerNo = B.no;
    
-- full outer join 겹치는 값과 모든 값들을 출력, MYSQL에서는 지원하지 않음
-- select * from company As A FULL OUTER JOIN owner AS B ON A.OwnerNo = B.no;
