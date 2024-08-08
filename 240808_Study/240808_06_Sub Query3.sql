-- 직원 급여 상위 5명 조회
select * from employees order by salary desc limit 5;

-- 위 조회 결과를 급여의 오름차순으로 보고 싶음
-- select 통해 나온 결과값도 테이블이기 때문에 from에 서브 쿼리로 입력 가능
select * from (select * from employees order by salary desc limit 5) As A order by SALARY;