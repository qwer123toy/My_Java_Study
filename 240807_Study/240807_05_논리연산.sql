-- select true && true;
-- &,|| 연산자들도 사용 가능하나
-- 보통 and, or, not 이라고 직접 명시함
select true and true;
select true or false;
select not true;

select 1 and 1; -- 참 
select 1 and 0; -- 거짓
select 1 or 0; -- 참

select 100 and 200; -- 0이 아닌 값은 참으로 여김
select -100 and 200;

select "1" and "1f";