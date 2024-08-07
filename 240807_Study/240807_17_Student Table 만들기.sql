CREATE TABLE IF NOT EXISTS student (
    lastName VARCHAR(5),
    firstName VARCHAR(20),
    korean INT,
    english INT,
    math INT
);
desc student;

SELECT * FROM student;

insert into student( lastName , firstName, korean, english, math)
	values ('고', '길동',100,100,100);
    
-- 컬럼 구성을 모두 알고 있고 다 입력할 때는 생략 가능
insert into student values ('홍', '길동',90,90,90);
insert into student values ('둘', '리',80,70,60),('도', '우너',50,null,80),('고', '희동',90,80,70);

-- '이름' 컬럼의 고유한 값 조회

select distinct firstname from student;

select * from student where english is null;

-- 연산에 null이 있을 경우 null을 반환
select *, korean+english+math as 'SUM' from student;

select * from student order by math desc;

-- 행의 제거
-- 지우고자 하는 행을 먼저 찾아봐야됨
select * from student where lastName = '도' and firstName = '우너';
delete from student where lastName = '도' and firstName = '우너';