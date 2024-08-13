-- 함수 개체 사용

SELECT HELLO();

SELECT PLUS(100, 200);

-- NULL 값을 넣을 경우 NULL 출력
-- 함수를 수정하여 null 일 경우 0으로 대체
SELECT PLUS(NULL, 200);

SELECT isZero(0);
SELECT isZero(5);

select toSum(10);