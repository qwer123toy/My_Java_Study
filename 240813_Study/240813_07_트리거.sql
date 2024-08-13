-- 이벤트 중 테이블의 행을 조작하고자 하는 경우
-- 이를 트리거라고 부름

SET @rowsCount = 0;

Insert into userinfo(userid, userpw, username)
	values ('가','가','가'),('나','나','나');

select @rowsCount;