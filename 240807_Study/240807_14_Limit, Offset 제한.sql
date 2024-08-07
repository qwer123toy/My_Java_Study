-- Limit : 행의 개수를 제한할 수 있음
select * from country limit 3;

select * from country where Continent = 'Asia' order by gnp limit 3;

-- 인구가 가장 많은 국가 하나
select * from country order by Population desc limit 2;

-- offset : 행 건너 뛰기
select * from country order by Population desc limit 1 offset 1;

-- 5등~11등
select * from country order by Population desc limit 7 offset 4;
select * from country order by Population desc limit 4, 7;
-- offset을 먼저 적고 뒤에 limit도 표기 가능

-- 30등~40등
select * from country order by Population desc limit 11 offset 29;

