-- 집계 함수 : 1행으로만 나옴
select count(*), first_name from employees;

select count(job_id) from employees;

-- last_name이 "A"로 시작하는 직원 수
select count(*) from employees where last_name like "A%";

-- salary가 10000~15000인 직원 수
select count(*) from employees where SALARY between 10000 and 15000;

-- Phone_NUMBER 컬럼으로 행의 개수 집계
-- NULL 값은 집계되지 않음
select count(PHONE_NUMBER) from employees;

select * from employees where PHONE_NUMBER is null;

