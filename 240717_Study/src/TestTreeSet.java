import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		set.add(50);
		set.add(20);
		set.add(90);
		set.add(30);
		set.add(100);
		
		for(Integer i : set) {
			System.out.println(i);
		}
	}
}
