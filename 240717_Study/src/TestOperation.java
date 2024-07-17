import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestOperation {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 30, 40));

		Set<Integer> set2 = new HashSet<>(Arrays.asList(30, 40, 50, 60));

		Set<Integer> duplicated = new HashSet<>();
		
		duplicated.addAll(set);
		
		//duplicated.removeAll(set2); // 차집합
		duplicated.retainAll(set2); //중복 값을 제외하고 삭제(교집합)
		
//		for (int n : set2) {
//			if (set.contains(n))
//				duplicated.add(n);
//		}

		System.out.println(duplicated);

	}
}
