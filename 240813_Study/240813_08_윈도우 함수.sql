

-- 행번호를 넣고 싶음
set @r = 0;
-- 세션변수는 조회할 때마다 값을 변경해줄 수 있음
-- 이 대 :=을 통해서 값 변경 가능
select @r := @r+1 AS 'rows', firstName, lastName
, korean, english, math from my_db.student order by english;

-- 윈도우 함수 사용
select 
	row_number() over mywin AS '행번호', -- row_number() 조회할 때마다 행번호를 가져옴
    rank() over mywin AS '랭킹', -- 순위매기기
    dense_rank() over mywin AS 'DENCE랭킹', -- 무조건 1씩 증가함, 동점자가 있을 때 1->3이 아닌 1->2
    firstName, lastName, korean, english, math from my_db.student A
    window mywin AS(order by english);
    