import java.util.ArrayList;

// Collection

public class TestList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("객체");
		list.add(new Object());
		list.add(Integer.valueOf(100));
		
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
	}
}
