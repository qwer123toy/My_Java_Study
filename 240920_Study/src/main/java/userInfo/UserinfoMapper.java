package userInfo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserinfoMapper {
	@Insert({"insert into userinfo (userId, userPw, userName)"
		,"values (#{userId}, #{userPw}, #{userName})"})
	int insert(Userinfo userinfo);
	
	@Select({ "select userId, userPw, userName from userinfo where userId = #{userId}" })
	Userinfo selectByPk(@Param("userId") String userId);
	
	@Select({"Select userId, userPw, userName from userinfo", "where userId=#{userId} AND userPw=#{userPw}"})
	Userinfo login(Userinfo userinfo);
}
