
use my_db;

-- membershobbys에서 greenmember 와 결합되는 내용 중 A.memID = B.MEM_NO 조건 중에
-- hobby 테이블과 결합되는 내용 중 A.hobbyID = C.no를 만족하는 테이블 조회
select * from membershobbys;
select * from greenmember;
select * from hobby;
select * from membershobbys A 
	LEFT JOIN greenmember B on A.memID = B.MEM_NO
    LEFT JOIN hobby C on A.hobbyID = C.no;

select B.NAME, C.hobby from membershobbys A 
	LEFT JOIN greenmember B on A.memID = B.MEM_NO
    LEFT JOIN hobby C on A.hobbyID = C.no;
    
-- 1번 인덱스 멤버의 취미 조회
    select B.NAME, C.hobby from membershobbys A 
	LEFT JOIN greenmember B on A.memID = B.MEM_NO
    LEFT JOIN hobby C on A.hobbyID = C.no
    where A.memID = 1;