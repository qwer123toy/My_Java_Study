import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();

		set.add(100);
		set.add(99);
		set.add(101);
		set.add(102);
		set.add(200);

		for (Integer i : set) {
			System.out.println(i);
		}
	}
}
