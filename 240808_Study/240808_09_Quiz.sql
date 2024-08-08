/*
	1. 전체 직원의 평균 salary보다 높은 salary를 받는 직원 조회
    2. 각 직원들의 이름, 급여, (평균급여 - 자신의 급여) 조회
    3. department_name이 'IT'인 부서에서 근무하는 직원의 수와 평균 급여 조회
    4. department_name이 'IT'인 부서에서 근무하는 직원의 급여 상위 3명을
								(FULL_Name : FIRST_NAME + LAST_NAME) 오름차순으로 조회
	5. job_id가 'ST_MAN', 'ST_CLERK'인 직원들 중 최고 급여 값, 최소 급여 값
    6. job_id가 'ST_MAN', 'ST_CLERK'인 직원들의 급여 합이, 전체 급여 중 몇 %의 비율인지 계산하여 조회
    ---
    1. 컬럼 제약 조건 중
		1-1. PRIMARY KEY란?
         - DB의 테이블에서 고유한 정보를 갖고 있는 하나 또는 여러 개의 컬럼
        1-2. NOT NULL?
         - 프라이머리 키 컬럼은 NULL 값을 가질 수 없고 항상 유효한 값을 가져야 함
        1-3. UNIQUE??
          - 고유값 설정, 중복값을 허용하지 않음
	2. AUTO_INCREMENT는 어떠한 컬럼에 적용할 수 있나요?
      -  새로운 행이 추가될 때마다 자동으로 증가하는 고유 값을 생성하는 데 사용. 주로 PRIMARY KEY 컬럼에 사용
    3. INDEX?
      - 데이터베이스 테이블에서 검색 및 조회 성능을 향상시키기 위해 사용되는 데이터 구조
		3-1. INDEX를 통한 검색 시 유리한 점?
          - 인덱스는 테이블의 특정 컬럼에 대해 빠른 검색을 가능하게 해줌
		  - 테이블 전체를 찾는 것이 아닌 INDEX 값만 확인하면 되기 때문에 효율적이고 빠르게 검색이 가능
*/


-- 1번
select * from employees where SALARY > (select avg(salary) from employees);

-- 2번
 select last_name, salary, ((select avg(salary) from employees) - salary) as "평균급여와의 차이" from employees;
 
 -- 3번
 select count(*), avg(salary) from employees where department_id = (select DEPARTMENT_ID from departments where department_name = "IT");
 


 -- 4번
 SELECT CONCAT(FIRST_NAME, ' ', Last_Name) AS 'FULL NAME' FROM employees 
	WHERE department_id = (SELECT DEPARTMENT_ID FROM departments WHERE department_name = 'IT')
ORDER BY salary DESC LIMIT 3;

-- 5번
-- select * from employees where job_id in(select job_id from jobs where JOB_ID = 'ST_MAN' or JOB_ID = "ST_CLERK") order by salary;
select max(Salary), min(salary) from employees where job_id in('ST_MAN',"ST_CLERK");
use hr;

-- 6번
select concat(round((select (select sum(SALARY) from employees 
	where job_id in('ST_MAN',"ST_CLERK"))/sum(salary)
	from employees)*100,1),"%") as "비율 조회";
