import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListIteration2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("원소1");
		list.add("원소2");
		list.add("원소3");
		list.add("원소4");
		list.add("원소5");
		
//		for (String s : list) {
//			System.out.println(s);
//		}
		
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
//		System.out.println("다음 원소가 있나요? " + iterator.hasNext());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		System.out.println(iterator.next());
//		
//		System.out.println("다음 원소가 있나요? " + iterator.hasNext());
//		iterator.next();
	}
}







