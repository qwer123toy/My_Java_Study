import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestLinkedList {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();

		list.add("문자열");
		list.add("원소");
		list.add("추가");
		list.remove(1);

		System.out.println(list.size());

		for (String n : list) {
			System.out.println(n);
		}
	}
}
