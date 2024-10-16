package kr.co.greenart.student;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import kr.co.greenart.book.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class Student {
	private int no;
	@NotNull
	@Length(min = 1, max = 45, message = "제목은 1~45자")
	private String lastName;
	@NotNull
	@Length(min = 1, max = 45, message = "작가는 1~45자")
	private String firstName;
	@Min(value = 0, message = "최소 점수는 0원입니다")
	@Max(value = 100, message = "최대 점수은 100점입니다")
	private int korean;
	@Min(value = 0, message = "최소 점수는 0원입니다")
	@Max(value = 100, message = "최대 점수은 100점입니다")
	private int english;
	@Min(value = 0, message = "최소 점수는 0원입니다")
	@Max(value = 100, message = "최대 점수은 100점입니다")
	private int math;
}
