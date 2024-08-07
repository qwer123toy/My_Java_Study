use hr;

show tables;

select * from employees;

-- 직원 'First Name' 'Last Name' 컬럼만을 조회(107행)
select first_name, last_name from employees;

-- Last Name이 "Olson'인 직원 조회
select first_name, last_name from employees where LAST_NAME="Olson";

-- Last Name이 "O"로 시작하는 직원 조회
select first_name, last_name from employees where LAST_NAME like "O%";

-- Last Name이 길이기 6인 직원 조회
select first_name, last_name from employees where LAST_NAME like "______";

select char_length('문자열길이확인');
-- Last Name이 길이기 6인 직원 조회
select first_name, last_name from employees where char_length(Last_NAME)=6;

-- first_name과 last_name을 결합한 이름을 별명(FULL NAME) 조회

select first_name, last_name, concat(first_name, " " ,last_name) as "FULL NAME" from employees;

-- First_NAME의 오름차순 조회

select first_NAME from employees order by FIRST_NAME;

select first_name, last_name, salary from employees;

select first_name, last_name, salary from employees where salary BETWEEN 10000 AND 15000;

-- 반올림
select round(15.623);
-- 2번 인자는 소숫점 자릿수
select round(15.123,2);

-- salary의 6%를 계산된 컬럼으로(별명 : tax, 소숫점 1자리) 조회
select first_name, last_name, salary, round(salary*0.06,1) as 'tax' from employees;

-- 급여 낮은순 1~20등
select first_name, last_name, salary from employees order by SALARY limit 20;

-- 급여 낮은순 31~60등
select first_name, last_name, salary from employees order by SALARY limit 30, 30;

-- department_ID
select first_name, last_name, department_ID from employees;

-- 부서 번호가 30이거나 100인 행
select first_name, last_name, department_ID from employees 
	where DEPARTMENT_ID = 30 or DEPARTMENT_ID = 100;
    
select first_name, last_name, department_ID from employees where DEPARTMENT_ID in (30,100);

-- job_ID
select job_id from employees;

-- distinct : 중복 제거
SELECT DISTINCT FIRST_NAME, JOB_ID FROM employees;

