import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;

	public int getSum() {
		return kor + eng + math;
	}
}
