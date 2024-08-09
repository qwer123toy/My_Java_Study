-- 직원 이름과 부서명
use hr;

select FIRST_NAME, LAST_NAME, DEPARTMENT_NAME
	from employees A, departments B
    where A.department_ID = B.department_ID;
    
select FIRST_NAME, LAST_NAME, DEPARTMENT_NAME
	from employees A
    join departments B on A.department_ID = B.department_ID;
-- 부서가 없는 직원이 현재 존재함, join -> 107행, left join ->106행
-- 직원이 없는 부서도 존재함 , join -> 107행, right join ->122행