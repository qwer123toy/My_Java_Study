import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSetToArray {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(Arrays.asList(100, 100, 200, 300, 300, 55, 77));
		
		
		Integer[] array = set.toArray(new Integer[0]);
		//toArray를 통해 배열에 삽입 가능
		//다만 순서는 set에 들어가있는 무작위 순서로 들어가짐
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
