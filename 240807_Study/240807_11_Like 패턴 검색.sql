-- Korea라는 문자를 사용하고 있는 국가
SELECT * FROM country
	WHERE name LIKE '%korea';
-- korea로 끝나는 문자열 검색,
-- %를 앞에 두면 해당 문자로 끝나는 문자 찾기

-- Region이 North로 시작하는 국가
SELECT * FROM country
	WHERE Region LIKE 'North%';

-- 국가명에 "A"가 포함되어 있는 국가
SELECT * FROM country
	WHERE Name LIKE '%A%';
    
SELECT * FROM country
	WHERE Name LIKE '______';
    
-- Name 'a'로 끝나는 6개 문자
SELECT * FROM country
	WHERE Name LIKE '_____a';

-- Name 'a'로 시작하는 6개 문자
SELECT * FROM country
	WHERE Name LIKE 'a_____';
