SELECT distinct ADNG_ADDR FROM estate;

SELECT distinct LET_TYPE FROM estate;

SELECT distinct ADNG_ADDR,LET_TYPE FROM estate;
-- 둘다 동일한 결과가 나옴
SELECT ADNG_ADDR,LET_TYPE
	FROM estate
    group by ADNG_ADDR, LET_TYPE;

-- 각 컬럼 별로 개수 파악 가능
SELECT ADNG_ADDR,LET_TYPE, COUNT(*)
	FROM estate
    group by ADNG_ADDR, LET_TYPE;

/*    
SELECT distinct ADNG_ADDR, '월세' FROM estate
	UNION
SELECT distinct ADNG_ADDR, '전세' FROM estate;
*/
-- 지역별 월세 전세 개수를 보는데 0개인 것도 같이 출력하기
SELECT A.ADNG_ADDR, A.LET_TYPE, IFNULL(`개수`, 0) AS '개수' FROM (
SELECT DISTINCT ADNG_ADDR, '월세' AS LET_TYPE FROM estate
 UNION
SELECT DISTINCT ADNG_ADDR, '전세' FROM estate
) A
	LEFT JOIN (SELECT ADNG_ADDR, LET_TYPE, COUNT(*) AS '개수'
	FROM estate
    GROUP BY ADNG_ADDR, LET_TYPE) B ON A.ADNG_ADDR = B.ADNG_ADDR AND A.LET_TYPE = B.LET_TYPE;