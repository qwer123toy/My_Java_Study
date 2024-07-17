import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class TestLinkedList2 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();

		list.add("문자열1");
		list.add("문자열10");
		list.add("문자열100");
		list.add("문자열1000");

		
		System.out.println(list.removeFirst());//가장 앞쪽의 원소를 제거하면서 참조하는 값을 반환함
		System.out.println(list.removeFirst());
		System.out.println(list.removeFirst());
		System.out.println(list.removeFirst());
		System.out.println(list);
	}
}
