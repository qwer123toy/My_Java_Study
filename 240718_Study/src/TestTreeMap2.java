import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Person implements Comparable<Person> {
	public int height;
	public int weight;
	
	public Person(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

	@Override
	public int compareTo(Person o) {
		return this.height - o.height;
	}
}

public class TestTreeMap2 {
	public static void main(String[] args) {
		// Person class - height, weight
		// List<String> - 취미 목록
		Comparator<Person> naturalOrder = Comparator.naturalOrder();
		Comparator<Person> thenComparing = naturalOrder.thenComparing(new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.weight - o2.weight;
			}
		});
		
		Map<Person, List<String>> hobbys = new TreeMap<>(thenComparing);
		hobbys.put(new Person(180, 80), Arrays.asList("낚시", "바둑", "사이클"));
		hobbys.put(new Person(170, 90), Arrays.asList("게임", "음악감상", "영화감상"));
		hobbys.put(new Person(190, 70), Arrays.asList("독서"));
		hobbys.put(new Person(180, 60), Arrays.asList("레이싱"));
		
		for (Entry<Person, List<String>> e : hobbys.entrySet()) {
			System.out.println(e.getValue());
		}
		
		
	}
}








