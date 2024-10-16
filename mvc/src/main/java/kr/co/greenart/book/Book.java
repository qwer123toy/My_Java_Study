package kr.co.greenart.book;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class Book {
	private int bookId;
	@NotNull
	@Length(min = 1, max = 45, message = "제목은 1~45자")
	private String title;
	@NotNull
	@Length(min = 1, max = 45, message = "작가는 1~45자")
	private String author;
	@NotNull
	@Length(min = 1, max = 45, message = "출판사는 1~45자")
	private String publisher;
	@Min(value = 0, message = "최소 가격은 0원입니다")
	@Max(value = 1_000_000, message = "최대 가격은 1,000,000원입니다")
	private int price;
}
