select code, name, population, indepyear from country;

-- 특정 컬럼이 NULL인 것을 찾기도 가능
SELECT 
    code, name, population, indepyear
FROM
    country
WHERE
    IndepYear IS NULL;
    
SELECT 
    code, name, population, indepyear
FROM
    country
WHERE
    IndepYear IS NOT NULL;
    
-- 1948
SELECT 
    code, name, population, indepyear
FROM
    country
WHERE
    IndepYear = 1948;