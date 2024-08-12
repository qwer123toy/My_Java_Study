-- 형변환
select convert('10.5',double) + 3.1; -- 

select convert('402',decimal(3)) + 30; -- decimal 안의 숫자는 자릿수
select convert('402',signed) + 30;
select convert('402',unsigned) + 30;

-- 형변환 함수 cast, convert
select cast('2024-08-12' AS DATE); -- CAST : 형변할 형을 AS로 적고 타입을 적음
select convert('2024-08-12', date); -- CONVERT : 형변할 형을 ,로 구분
