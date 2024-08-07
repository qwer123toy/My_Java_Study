-- continent 컬럼 'asia' 조회
select * FROM country where Continent = 'asia';

-- 아시아 제외 조회
select * FROM country where Continent <> 'asia';

-- 'asia' 이면서 인구 2천만 이하
select * FROM country where Continent = 'asia' and Population <= 20000000;
