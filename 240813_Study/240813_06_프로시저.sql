-- Stored Procedure (SP)

-- 호출 시 동작
call usp_userinfo;

call usp_member_hobby;

call usp_delete_user('ghi',@result);
select @result;