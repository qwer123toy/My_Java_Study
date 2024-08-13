-- myVar 값이 100 이하면 hund 라고 조회, 아니면 'not hund'
-- CASE WHEN : 끝을 알려주는 END와 짝을 이루며, 상황에 맞게 출력값을 달리 할 수 있음
SELECT CASE WHEN @myVar = 100 THEN 'hund'
        ELSE 'not hund' END;

-- ELSE를 없앨 수도 있음, 이때는 NULL 값이 자동으로 들어감
SELECT CASE WHEN @myVar = 3 THEN 'THREE' END;

-- 여러번 비교도 가능
SELECT CASE WHEN @myVar = 3 THEN 'THREE'
		WHEN @myVar = 5 THEN 'FIVE'
		WHEN @myVar = 7 THEN 'SEVEN'
    END;

-- 동일한 값으로 비교를 할 때는 WHEN 앞에 값을 적고 바로 조건절로 사용 가능
SELECT CASE @myVar WHEN  3 THEN 'THREE'
		WHEN 5 THEN 'FIVE'
		WHEN 7 THEN 'SEVEN'
    END;   

-- 참이면 hund, 거짓이면 not hund가 나오는 함수도 가능
-- 삼항연산자와 흡사함
SELECT IF(@myVar =100,'hund','Not Hund');

