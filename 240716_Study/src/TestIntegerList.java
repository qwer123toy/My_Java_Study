import java.util.ArrayList;

public class TestIntegerList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(Integer.valueOf(100));
		list.add(200);
		
		System.out.println(list.size());
		
		System.out.println(list.get(0));
		int elem = list.get(1);
		
		System.out.println(elem);
		
		elem++;
		
		System.out.println(list.get(1));
	}
}
