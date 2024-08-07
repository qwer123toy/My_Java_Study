
create database my_db;
create database if not exists your_db;

-- DB 생성 및 삭제
drop database if exists your_db;

-- 해당 DB를 사용, 필히 체크해줄 것
use my_db;

create table if not exists practice(
	col1 varchar(100), -- 이름, 데이터 타입 / varchar : 가변길이 문자열, 실제 값에 따라 길이를 조절
    col2 char(10), -- SQL에서는 고정 길이 문자열을 의미, 문자를 1개 넣어주더라도 공간 10개를 차지함
    col3 INT -- 정수
);

show tables;
desc practice;
select * from practice;

-- 컬럼에 값 넣기
insert into practice (col1, col2, col3) values("첫번째컬럼",'두번째컬럼',300);
insert into practice (col3, col2, col1) values(200,'A','가');

-- null값도 넣을 수 있으며 values를 통해 여러 행 삽입도 가능
insert into practice (col1, col2, col3) values(null,null,null);
insert into practice (col1, col2, col3)
	values ('에이행', '에이행',10),('비행', '비행',20);
    
insert into practice(col3) values (3.14); 
insert into practice(col3) values ("abc"); -- 문자열은 INT에 넣기 불가능
insert into practice(col3) values ('3.64'); -- 다만 숫자가 문자열에 있으면 반올림으로 숫자를 넣어줌
insert into practice(col3) values (true); -- true, false도 숫자로 삽입 가능

insert into practice(col2) values ('asdfasdfasdfasdf'); -- 문자열 길이 초과 에러

drop table practice;