select * from files;

-- 공백이 있으면 하나만 나오도록 출력
select collapse_space('       asdf            zxcv qwer     ');

SELECT REGEXP_REPLACE('       asdf            zxcv qwer     ', '( ){2,}', ' ');

-- 길이값만큼 랜덤한 문자열
select random_strings(10);