import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestTreeHeadTail {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>(Arrays.asList(10, 20, 30, 40, 50));
		Map<Integer, String> map = new TreeMap<>();
		map.put(10, "십");
		map.put(20, "이십");
		map.put(30, "삼십");
		map.put(40, "사십");
		map.put(50, "오십");

		SortedSet<Integer> headSet = set.headSet(30);
		System.out.println(headSet);
		SortedSet<Integer> tailSet = set.tailSet(30);
		System.out.println(tailSet);

		headSet.add(15);
		System.out.println(set);

		tailSet.add(35);
		System.out.println(set);

		TreeMap<Integer, String> map2 = new TreeMap<>();
		map2.put(10, "십");
		map2.put(20, "이십");
		map2.put(30, "삼십");
		map2.put(40, "사십");
		map2.put(50, "오십");

		SortedMap<Integer, String> headMap = map2.headMap(30);
		System.out.println(headMap);
		headMap.put(15, "시보");
		System.out.println(headMap);

	}
}
