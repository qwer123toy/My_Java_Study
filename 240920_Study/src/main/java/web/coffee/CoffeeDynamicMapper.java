package web.coffee;

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

public interface CoffeeDynamicMapper {
	//파라미터가 null일 때는 전부 조회, 값이 있을 때는 between으로 조회하는 동적인 방식으로 만들어보자
	@SelectProvider(type = CoffeeSQLProvider.class, method = "getAllOrByPrice")
	@Results({
		@Result(column = "coffeeId", property = "coffeeId", jdbcType = JdbcType.INTEGER, id = true),
		@Result(column = "coffeeName", property = "coffeeName", jdbcType = JdbcType.VARCHAR),
		@Result(column = "coffeePrice", property = "coffeePrice", jdbcType = JdbcType.INTEGER),
		@Result(column = "userId", property = "userId", jdbcType = JdbcType.VARCHAR)
	})
	List<Coffee> getAllOrByPrice(@Param("start") Integer start, @Param("end") Integer end);
	
	
	
	@SelectProvider(type = CoffeeSQLProvider.class, method = "count")
	int count(@Param("start") Integer start, @Param("end") Integer end);
	
	
	@Insert("insert into coffees (coffeeName, coffeePrice, userId) values(#{coffeeName}, #{coffeePrice},#{userId})")
	int insert(Coffee coffee);
	
	@Delete("delete from coffees where coffeeid = #{coffeeId}")
	int delete(@Param("coffeeId") int coffeeId);
	
	@Update({"update", "coffees", "set coffeeName = #{coffeeName},", "coffeePrice = #{coffeePrice},", "userId = #{userId}",
			"where coffeeId = #{coffeeId}"})
	int update(Coffee coffee);
	
	@Select("select coffeeId, coffeeName, coffeePrice, userId from coffees where coffeeId = #{coffeeId}")
	Coffee selectByPk(@Param("coffeeId") int coffeeId);
	
	class CoffeeSQLProvider {
		
		
		public static String getAllOrByPrice(@Param("start") Integer start, @Param("end") Integer end) {
			return new SQL() {
				{
					SELECT("coffeeId", "coffeeName", "coffeePrice", "userId");
					FROM("coffees");
					if (start != null && end != null) {
						WHERE("coffeePrice between #{start} and #{end}");
					}
				}
			}.toString();
		}
		
	
		public static String count(@Param("start") Integer start, @Param("end") Integer end) {
			return new SQL() {
				{
					SELECT("count(*)");
					FROM("coffees");
					if (start != null && end != null) {
						WHERE("coffeePrice between #{start} and #{end}");
					}
				}
			}.toString();
		}
	}
}