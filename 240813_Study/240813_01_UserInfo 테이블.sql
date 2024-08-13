create table userinfo(
	userid varchar(20) unique not null, -- 가입시 ID, NOT NULL 고유
    userpw varchar(20)  not null, -- 가입시 비밀번호, NOT NULL
    username varchar(20) unique not null, -- 가입시 유저명, NOT NULL 고유
    createdAt timestamp not null default current_timestamp -- 가입일자, NOT NULL 기본값 현재시간
    );

insert into userinfo (userid, userpw, username)
	values ('abc','abc','abc'), ('def','def','def'),('ghi','ghi','ghi');
    
select * from userinfo;

-- 삭제했을 때 복구 방법이 없음, 물리적 삭제
delete from userinfo where userid='abc';

insert into userinfo (userid, userpw, username)
	values ('abc','abc','abc');
    
-- 논리적 삭제는?
-- 활성화라는 컬럼을 만들어서 논리적 삭제를 관리할 계획
alter table userinfo
	add column active bit default 1;
    
-- 물리적 삭제가 아닌 논리적 삭제 진행
update userinfo
	set active =0
	where userID = 'def';

-- 활성화된 user만 보여줌
select * from userinfo where active = 1;

-- 테이블 내의 컬럼을 삭제하는 것도 alter를 통해 가능
alter table userinfo
	drop column active;
    
-- 같은 모양의 테이블 만들기
-- 원본 테이블이 존재할 경우 like를 통해 생성 가능
create table if not exists deletedusers like userinfo;

-- 삭제한 유저를 관리하기 위한 테이블을 만든 후 기존 정보를 해당 테이블에 옮긴 뒤
-- 원본 테이블에서 내용을 삭제할 수 있음
insert into deletedusers select * from userinfo where userid = 'def';
delete from userinfo where userid = 'def';

select * from userinfo;
select * from deletedusers;