SELECT * FROM my_study_db.estate;

select * from estate where no = 343;

-- 월세의 보증금 평균
SELECT AVG(GDPS_AVG) AS '보증금 평균', AVG(MMRT_AVG) AS '월세 평균' FROM estate WHERE LET_TYPE = '월세';

-- 전세의 보증금 평균
SELECT AVG(GDPS_AVG) AS '보증금 평균', AVG(MMRT_AVG) AS '월세 평균' FROM estate WHERE LET_TYPE = '전세';

-- UNION을 통해 합쳐서 출력 가능
SELECT LET_TYPE, (GDPS_AVG) AS '보증금 평균', AVG(MMRT_AVG) AS '월세 평균' FROM estate WHERE LET_TYPE = '월세'
	UNION
SELECT LET_TYPE, AVG(GDPS_AVG) AS '보증금 평균', AVG(MMRT_AVG) AS '월세 평균' FROM estate WHERE LET_TYPE = '전세';

-- 월세와 전세 평균을 봄
SELECT BLDG_CTGO, AVG(GDPS_AVG), AVG(MMRT_AVG)
	FROM estate
    GROUP BY BLDG_CTGO;
    
-- 전세 행 제외하기
SELECT BLDG_CTGO, AVG(GDPS_AVG), AVG(MMRT_AVG)
	FROM estate
    WHERE LET_TYPE != '전세'
    GROUP BY BLDG_CTGO;

-- 빌딩타입과 전월세타입 두개를 기준으로 조회하고 싶음
SELECT BLDG_CTGO, LET_TYPE, AVG(GDPS_AVG), AVG(MMRT_AVG)
	FROM estate
    GROUP BY BLDG_CTGO, LET_TYPE;
    -- GROUP BY를 통해 두개의 컬럼을 각각 기준으로 합쳐서 조회 가능
    
SELECT ADNG_ADDR, AVG(GDPS_AVG), AVG(MMRT_AVG)
	FROM estate
    GROUP BY ADNG_ADDR;
    
-- 전세 평균 보증금이 1억 이하인 행정동 조회하기
SELECT ADNG_ADDR, AVG(GDPS_AVG)
	FROM estate
    WHERE LET_TYPE = '전세'
    GROUP BY ADNG_ADDR
    HAVING AVG(GDPS_AVG) <= 100000;
    
-- 전세 평균 보증금이 가장 높은 3개 지역 조회
SELECT ADNG_ADDR, AVG(GDPS_AVG)
	FROM estate
    WHERE LET_TYPE = '전세'
    GROUP BY ADNG_ADDR
    HAVING AVG(GDPS_AVG) <= 100000
    ORDER BY AVG(GDPS_AVG) DESC LIMIT 3;