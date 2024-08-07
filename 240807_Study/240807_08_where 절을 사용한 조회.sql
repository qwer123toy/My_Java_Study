-- 인구 4천만 이상 조회
SELECT * FROM country
	WHERE Population >= 40000000;

-- 5천만 이하
SELECT * FROM country
	WHERE Population <= 50000000;
    
-- 4천만 ~ 5천만
SELECT * FROM country
	WHERE Population >= 40000000 AND Population <= 50000000;

SELECT * FROM country
	WHERE Population BETWEEN 40000000 AND 50000000;