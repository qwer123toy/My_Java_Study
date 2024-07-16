import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCollectionMethods3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "c", "d", "e"));

		List<String> subList = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));

		boolean containsAll = list.containsAll(subList); // 순서 상관없이 들어 있는 모든 원소를 확인

		System.out.println(containsAll);
		list.retainAll(subList);//해당하는 원소만 남김
		
		System.out.println(list);
		
	}
}
