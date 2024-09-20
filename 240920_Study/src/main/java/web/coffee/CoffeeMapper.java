package web.coffee;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface CoffeeMapper {

	// SQL 쿼리를 통해 coffees 테이블의 모든 데이터를 조회하는 메서드
	@Select("select coffeeId, coffeeName, coffeePrice from coffees") // 데이터베이스에서 조회할 SQL 쿼리
	@Results({
			// 쿼리 결과에서 'coffeeId' 컬럼을 'coffeeId' 속성으로 매핑, INTEGER 타입이며 PK (id = true)
			@Result(column = "coffeeId", property = "coffeeId", jdbcType = JdbcType.INTEGER, id = true),
			// 쿼리 결과에서 'coffeeName' 컬럼을 'coffeeName' 속성으로 매핑, VARCHAR 타입
			@Result(column = "coffeeName", property = "coffeeName", jdbcType = JdbcType.VARCHAR),
			// 쿼리 결과에서 'coffeePrice' 컬럼을 'coffeePrice' 속성으로 매핑, INTEGER 타입
			@Result(column = "coffeePrice", property = "coffeePrice", jdbcType = JdbcType.INTEGER) })
	// 커피 리스트를 반환하는 메서드, 쿼리 실행 결과를 List<Coffee>로 매핑
	List<Coffee> selectAll();

	@Select("select count(*) from coffees")
	int countAll();

	// 이전에 물음표를 써서 연결했던 자리를
	// #{}로 연결해줌
	@Select("select coffeeId, coffeeName, coffeePrice from coffees where coffeePrice between #{start} and #{end}")
	List<Coffee> searchByPrice(@Param("start") int start, @Param("end") int end);

	//파라미터의 유무에 따라 메서드를 따로 구현했음
	//mybatis는 파라미터의 유무에 따라 동적인 쿼리문을 생성해줄 수 있음
	@Select(
		{
		"select",
		"count(*) from coffees",
		"where coffeePrice between #{start} and #{end}"
		}	
    )
    int countByPrice(@Param("start") int start, @Param("end") int end);
}
