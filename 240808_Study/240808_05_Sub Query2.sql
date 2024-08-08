-- 부서 테이블(department) 부서명이 A로 시작하는 부서조회
select department_id from departments where department_name like "A%";

-- 직원 테이블 부서명이 A로 시작하는 곳에 근무하는 직원 조회
-- 서브 쿼리를 단순히 하나의 값만 나오는게 아닌 여러 행을 반환하는 것으로도 사용 가능
select * from employees where department_id in (select department_id from departments where department_name like "A%");

