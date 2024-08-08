-- 집계함수 합, 평균
select SUM(salary) from employees;
select  SUM(COMMISSION_PCT) from employees;
select sum(salary), count(*), sum(salary)/count(*) as "AVG" from employees;

select sum(salary), count(*), AVG(salary) from employees;

-- 최대값, 최소값
select max(salary), min(salary) from employees;