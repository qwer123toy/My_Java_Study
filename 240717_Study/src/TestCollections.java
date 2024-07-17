import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCollections {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>(Arrays.asList(100,55,77,33,200));
		
		//Collections.sort(set);
//		System.out.println(Collections.min(set));
//		System.out.println(Collections.max(set));
		
		List<Integer> unmodifiableList = Arrays.asList(1,2,3,4); 
		//unmodifiableList.add(0); // 추가, 삭제 불가능(읽기전용)
		Set<Integer> unmodifiableSet = Collections.unmodifiableSet(set);
		//unmodifiableSet.add(0); //추가, 삭제 불가능(읽기전용)
		
		List emptyList = Collections.EMPTY_LIST;
		List<Object> emptyList2 = Collections.emptyList();
		
		System.out.println(emptyList);

	}
}

