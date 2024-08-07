SHOW DATABASES; -- 현재 MySQL 서버에 존재하는 모든 데이터베이스의 목록을 보여줌
SHOW schemas; --  MySQL 서버에 있는 모든 데이터베이스(스키마)의 목록을 보여줌

USE world; --  world라는 이름의 데이터베이스를 사용하도록 지정

SHOW TABLES;

USE sakila; -- 해당 스키마 사용
SHOW TABLES;

USE world;
DESC country;-- country 테이블의 구조(컬럼, 데이터 타입, Null 허용 여부 등)를 보여줌
SELECT 
    Name, Population
FROM
    country;-- 해당 테이블의 컬럼 값 조회

SELECT 
    population, name
FROM
    country;

SELECT 
    asdf
FROM
    country;-- 없는 컬럼일 경우 에러코드 출력
SELECT 
    *
FROM
    country;-- 모든 컬럼을 나타내기 : * 

SELECT 
    name, name, name
FROM
    country;
    
-- as를 통해 이름 컬럼 이름 설정 가능
select name, name as '이름', name as '국가명' from country;
 
-- WHERE 을 통해 행을 특정시킬 수 있는 연산 식 사용 가능
select * from country where name = "South Korea";
select code,name,population from country where name = "Japan";

-- 조건문 여러개일 때는 or나 and로 묶어서 표기
select * from country where name = "South Korea" or name = "Japan";

SELECT 
    *
FROM
    country
WHERE
    name = 'South Korea' 
		OR name = 'Japan'
        OR name = 'China';
        
-- in 을 이용하여 이 중에 있는지 검색 가능(or 연산자와 동일)
select * from country where name in('South Korea', 'Japan','China','a');

