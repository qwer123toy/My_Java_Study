import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet2 {
	public static void main(String[] args) {
		Set<Cup> set = new TreeSet<>(Comparator.reverseOrder());// 역순 출력 가능
		
		set.add(new Cup(100));
		set.add(new Cup(100));
		set.add(new Cup(200));
		System.out.println(set);
	}
}