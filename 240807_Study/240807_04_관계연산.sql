select 10 =10; -- 같은지 판단 여부는 equal 연산자 하나만 사용
select '문자열' = "문자열";
select 'abc' = "ABC"; -- 대소문자 구분없음
select 10 = '10a'; -- 문자열에 있는 숫자도 찾아서 비교

select 10 !=9; -- 부정 표현은 자바와 동일
select '헬로' != "월드";
select 5<>3; -- 다른지 확인하기 위한 연산자로 부등호<> 사용 가능

select 10>3;
select 5<7;
select 10>=3;
select "A" > "C"; -- 문자열 값도 대소비교 가능