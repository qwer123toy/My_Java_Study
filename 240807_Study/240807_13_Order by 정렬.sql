-- 인구수로 정렬하기
SELECT * FROM country ORDER BY Population; -- 정렬, 기본은 오름차순(ASC)

SELECT * FROM country ORDER BY Population DESC; -- 내림차순(DESC)

SELECT * FROM country
	where Population <> 0
    ORDER BY Population;
    
-- continent가 'Asia', SurfaceArea의 내림차순으로 조회
SELECT * FROM country
	where Continent = 'Asia'
    ORDER BY SurfaceArea DESC;
    
-- ,를 통해 여러개의 정렬 기준 설정 가능
SELECT * FROM country
    ORDER BY Continent asc, GNP desc;


SELECT name AS '국가명', population / surfacearea AS '인구밀도'
	FROM country
	order by 인구밀도 desc;