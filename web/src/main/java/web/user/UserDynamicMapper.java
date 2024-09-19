package web.user;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.type.JdbcType;

public interface UserDynamicMapper {
	//파라미터가 null일 때는 전부 조회, 값이 있을 때는 between으로 조회하는 동적인 방식으로 만들어보자
	@SelectProvider(type = userSQLProvider.class, method = "userAll")
	@Results({
		@Result(column = "userId", property = "userId", jdbcType = JdbcType.VARCHAR, id = true),
		@Result(column = "userName", property = "userName", jdbcType = JdbcType.VARCHAR),
		@Result(column = "createdAt", property = "createdAt", jdbcType = JdbcType.TIMESTAMP)
	})
	List<User> userAll();
	
	
	
	
	@Insert("insert into userinfo (userId, userPw, userName) values(#{userId}, #{userPw}, #{userName})")
	int insert(User user);
	
	
	
	class userSQLProvider {
		
		public static String userAll() {
			return new SQL() {
				{
					SELECT("userId", "userName", "createdAt");
					FROM("userinfo");
					
				}
			}.toString();
		}
		
	
	
	}
}