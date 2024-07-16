import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestInitList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("원소1", "원소2", "원소3"));
		
		System.out.println(list.toString());
	}
}
