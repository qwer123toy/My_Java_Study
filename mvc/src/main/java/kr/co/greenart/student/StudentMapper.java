package kr.co.greenart.student;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface StudentMapper {
	@Select("Select Count(*) from student")
	int count();
	
	@Select("SELECT * from student")
	@Results(
			id = "studentResults"
			, value= {
					@Result(column = "no", property = "no", id= true)
					, @Result(column = "lastName", property = "lastName")
					, @Result(column = "firstName", property = "firstName")
					, @Result(column = "korean", property = "korean")
					, @Result(column = "english", property = "english")
					, @Result(column = "math", property = "math")
			}
			)
	
	List<Student> findAll();
	
	@Select("SELECT * FROM student LIMIT #{limit} OFFSET #{offset}")
	@ResultMap("studentResults")
	List<Student> findPage(int limit, int offset);
	
	@Select("SELECT * FROM student where no = #{no}")
	@ResultMap("studentResults")
	Student findByPk(int no);
	
	@Insert({"INSERT INTO student(lastName, firstName, korean, english, math)"
			,"VALUES(#{lastName}, #{firstName}, #{korean}, #{english}, #{math})"
	})
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", 
			keyColumn = "no", keyProperty = "no"
			, resultType = int.class, before = false)
	int insert(Student student);
	
	@Delete("DELETE from student where no = #{no}")
	int delete(int no);
	
	@Update("UPDATE student SET lastName=#{lastName}, firstName=#{firstName}, "
			+ "korean=#{korean}, english=#{english}, math=#{math}"
			+ " where no = #{no}")
	int update(Student student);
}
