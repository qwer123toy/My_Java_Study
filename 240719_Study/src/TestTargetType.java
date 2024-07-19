import java.util.ArrayList;
import java.util.List;

public class TestTargetType {
	public Object[] createTenLengthArray() {
		return new Object[10];
	}
	
	public static <T> List<T> createArray() {
		return new ArrayList<>();
	}
	
	public static void main(String[] args) {
		List<String> createList = createArray();
		createList.add("문자열");
		
		List<Integer> list = TestTargetType.<Integer>createArray();
	}
}
