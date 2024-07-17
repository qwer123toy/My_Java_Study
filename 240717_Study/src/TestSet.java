import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("원소");
		set.add("원소");
		set.add("원소");
		
		set.add("원소");
		set.add("원소");
		
		System.out.println(set.size());
	}
}
