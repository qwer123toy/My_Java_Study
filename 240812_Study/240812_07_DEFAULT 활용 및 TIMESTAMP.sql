SELECT * FROM my_study_db.diary;

insert into diary (date1, date2, title, content)
	values('2024-08-12','2024-08-12','제목','내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용');

-- datetime은 9999년까지 표현 가능
-- 시간대라는 기록이 남지 않음
insert into diary (date1, date2, title, content)
	values('9999-08-12','2024-08-12','제목','내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용');

-- timestamp는 2038년까지 표현 가능하므로 9999년은 입력 불가
-- 시간대라는 기록이 남음(한국시간으로 몇 시 몇 분 등)
insert into diary (date1, date2, title, content)
	values('2024-08-12','9999-08-12','제목','내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용');
    
-- 제목을 입력하지 않을 경우 default 값으로 설정된 제목이 들어감
insert into diary (date1, date2,  content)
	values('2024-08-12','2024-08-12','내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용내용');

insert into diary (content)
	values('내용');

insert into diary (content)
	values('테스트용 행 추가');    
select * from diary WHERE ID=7;

UPDATE DIARY SET TITLE='새로운 제목' WHERE ID = 7;