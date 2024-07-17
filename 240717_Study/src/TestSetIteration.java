import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSetIteration {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("원소1");
		set.add("원소2");
		set.add("원소3");
		set.add("원소4");
		set.add("원소5");
		
		//System.out.println(set.contains("원소1"));
		
//		for(String s : set) {
//			System.out.println(s);
//		}//삽입 순서 보장 X
//		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
