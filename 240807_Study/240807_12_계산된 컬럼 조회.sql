select code, name, gnp from country;

-- 1.1배가 적용된 컬럼을 보여주는 것도 가능
SELECT 
    code, name, gnp, gnp * 1.1 AS '기대 GNP'
FROM
    country;
    
select name as '국가명', surfacearea as "면적", population as '인구' from country;

-- 인구 밀도(인구/면적)
select name as '국가명', population/surfacearea as "인구밀도" from country;

SELECT name AS '국가명', population / surfacearea AS '인구밀도' FROM country
	WHERE (population / surfacearea) < 50;


    
