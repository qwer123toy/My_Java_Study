SELECT EMPLOYEE_ID, A.FIRST_NAME, A.LAST_NAME, A.DEPARTMENT_ID FROM employees AS A;
-- Table을 as로 별명을 설정해두면 select에서도 활용이 가능함

SELECT EMPLOYEE_ID, A.FIRST_NAME, A.LAST_NAME, A.DEPARTMENT_ID,
	(select DEPARTMENT_NAME from departments where A.DEPARTMENT_ID = DEPARTMENT_ID) AS '부서명' -- sub-query
    FROM employees AS A;


select DEPARTMENT_NAME from departments where DEPARTMENT_ID = 100;

select * from departments;

select salary from employees where employee_id = 200;

select * from employees where salary>(select salary from employees where employee_id = 200);

-- 가장 낮은 급여 직원 목록 조회

select salary from employees order by salary limit 1;

-- 가장 높은 급여 직원
select salary from employees order by salary desc limit 1;

select * from employees where salary = (select salary from employees order by salary desc limit 1);

-- 가장 낮은 급여 or 가장 높은 급여 받는 직원 목록

select * from employees 
	where salary = (select salary from employees order by salary desc limit 1) or
    salary = (select salary from employees order by salary limit 1);
    
-- 100번 직원과 모든 직원의 급여 차이 조회
select salary from employees where employee_id = 100;
select first_name, last_name, salary, ((select salary from employees where employee_id = 100) - salary) as 'GAP'
	from employees;