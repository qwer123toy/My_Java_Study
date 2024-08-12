-- Data Type
-- 숫자
-- 문자열(글자)

-- Date and Time
-- 날짜 : Date
-- 시간 : Time
-- 날짜 및 시간 : Datetime, Timestamp

-- 서버의 현재 시간 확인
Select current_time();
Select current_Date(); -- 현재 날짜
select current_Timestamp(); -- 날짜 및 시간


select date '2024-08-12'; -- 앞에 Date라고 붙이면 날짜 타입으로 변경됨
select date '2024-08-40'; -- 그래서 날짜 타입에 안맞는 수치 입력시 에러 발생
select time '14:16:00'; -- time도 동일하게 시간 타입으로 변경

-- 날짜에서 연/월/일 추출하기
select extract(year from date '2024-08-12');
select extract(month from date '2024-08-12');
select extract(day from date '2024-08-12');

-- 날짜에서 요일 추출하기
select dayofweek(date '2024-08-12'); -- 일요일 1, 월요일 2, 화요일 3 ...

-- 날짜에서 더하기
-- select date '2024-08-12'+30; -- 올바른 값이 나오지 않음 20240842
select adddate('2024-08-12',30);
select date '2024-08-12' + interval 30 day;
select date_add('2024-08-12', interval 30 day);
select date_sub('2024-08-12', interval 30 day); -- 날짜 빼기

-- 날짜 사이의 일수 계산하기
select datediff('2024-08-30', '2024-08-12');

-- 날짜 출력 형식 포맷 바꾸기
select date_format('2024-08-12', "%y년 %m월 %d일") as '연월일';

-- 문자열을 날짜 타입으로 변경
select str_to_date('24/08/12', '%y/%m/%d');