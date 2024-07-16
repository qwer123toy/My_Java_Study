import java.util.ArrayList;
import java.util.List;

public class TestListIteration {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("원소1");
		list.add("원소2");
		list.add("원소3");
		list.add("원소4");
		list.add("원소5");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
	}
}
