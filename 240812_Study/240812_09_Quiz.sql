/*
1. null 값을 치환하는 함수 찾기
2. 문자열 자르는 함수 찾기
3. 테이블 정의 만들기
4. name : 가변길이문자열이며 최대 8자
5. age : null 값을 허용하지 않음, 정수형, 기본값 1
6. phone : 가변길이문자형 10글자 
7. create : null 값 허용 하지 않음, timestamp형, 기본값은 서버의 현재 날짜
8. PK 고민하기
9. insert into select 구문을 만들어 보세요
	ex) insert into 'table 이름' ('컬럼 구성') select '컬럼구성' from temp;
*/
select * from temp;

create table Quiz0821(
	name varchar(8),
    age int not null default 1,
    phone varchar(10) primary key,
    created timestamp not null default current_timestamp
);

insert into quiz0821(name, age, phone, created) 
	select SUBSTR(name,1,8), TRUNCATE(ifnull(age,1),0), phone, ifnull(created, current_timestamp) 
    from temp;
drop table quiz0821;
select * from quiz0821;