-- transaction 제어
-- 트랜잭션 특징 : 연결 내부에서 존재하므로 연결을 끊으면 rollback이 됨
-- 세션 : 연결이 유지되는 시간
start transaction;

select * from temp;

delete from temp;

rollback;

select * from temp;

-- 작업이 끝난 후 정상적으로 처리됐는지 확인한 뒤에 commit 하거나 이상한 점이 발견되면 rollback 가능

