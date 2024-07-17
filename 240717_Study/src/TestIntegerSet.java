import java.util.HashSet;
import java.util.Set;

public class TestIntegerSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(100);
		set.add(10);
		set.add(5);
		set.add(null);
		
		set.add(null);
		
		System.out.println(set);
	}
}
