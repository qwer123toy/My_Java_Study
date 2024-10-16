package kr.co.greenart.book;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

@Mapper
public interface BookMapper {
	@Select("Select Count(*) from book")
	int count();
	
	@Select("SELECT * from book")
	@Results(
			id = "bookResults"
			, value= {
					@Result(column = "bookId", property = "bookId", id= true)
					, @Result(column = "title", property = "title")
					, @Result(column = "author", property = "author")
					, @Result(column = "publisher", property = "publisher")
					, @Result(column = "price", property = "price")
			}
			)
	
	List<Book> findAll();
	
	@Select("SELECT * FROM book LIMIT #{limit} OFFSET #{offset}")
	@ResultMap("bookResults")
	List<Book> findPage(int limit, int offset);
	
	@Select("SELECT * FROM book where bookId = #{bookId}")
	@ResultMap("bookResults")
	Book findByPk(int bookId);
	
	@Insert({"INSERT INTO book(title, author, publisher, price)"
			,"VALUES(#{title}, #{author}, #{publisher}, #{price})"
	})
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", 
			keyColumn = "bookId", keyProperty = "bookId"
			, resultType = int.class, before = false)
	int insert(Book book);
}
