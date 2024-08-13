-- 세션 변수
set @myVar = 100;

-- 접속이 유지되는 동안 사용 가능
select @myVar;

-- 자료까지 동일하게 복사한 테이블 생성
create table copy
	select * from temp;

-- 세션을 유지하는 동안만 사용하는 테이블
create temporary table copy2
	select * from temp;

-- 물리적 복사를 한 copy는 남아있지만
-- 연결 종료 후 다시 확인해보면 copy2는 없는걸 확인할 수 있음
select * from copy;
select * from copy2;

insert into my_db.owner (name) values('키값 확인용');

-- 가장 최근에 성공적으로 수행된 INSERT 구문에 대해서 (update, delete 등 에는 영향받지 않음)
-- 자동으로 생성 되는 AUTO_INCREMENT 인 column 의 값을 반환
select last_insert_id();
select * from my_db.owner where no = 15;