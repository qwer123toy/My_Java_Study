import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class CollectionsEquality {
	public static void main(String[] args) {
		List<Integer> datas = Arrays.asList(200, 300, 100, 400);

		ArrayList<Integer> arrayList = new ArrayList<>(datas);
		LinkedList<Integer> linkedList = new LinkedList<>(datas);

		System.out.println(arrayList.equals(linkedList)); // true
		// System.out.println(arrayList.equals(linkedHashSet));
		// 원소와 사이즈, 순서를 비교하여 같은지 확인

		HashSet<Integer> hashSet = new HashSet<>(datas);
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(datas);
		TreeSet<Integer> treeSet = new TreeSet<>(datas);
		
		System.out.println(hashSet.equals(linkedHashSet)); // true
		System.out.println(hashSet.equals(treeSet)); // true
		System.out.println(linkedHashSet.equals(treeSet)); // true

		System.out.println(arrayList);
		System.out.println(linkedList);
		System.out.println(hashSet);
		System.out.println(linkedHashSet);
		System.out.println(treeSet);
	}
}
