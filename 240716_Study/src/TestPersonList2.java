import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestPersonList2 {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("길동"));
		list.add(new Person("둘리"));
		list.add(new Person("도우너"));
		list.add(new Person("마이콜"));
		System.out.println(list.size());
		System.out.println(list.toString());

		list.add(3, new Person("희동"));// n번째 인덱스 값에 리스트를 삽입
		System.out.println(list.size());
		System.out.println(list.toString());

		list.remove(0);
		System.out.println(list.size());
		System.out.println(list.toString());

		list.remove(new Person("도우너"));
		System.out.println(list.size());
		System.out.println(list.toString());

		list.add(new Person("희동"));
		list.add(new Person("희동"));
		list.add(new Person("희동"));
		boolean contains = list.contains(new Person("희동"));// 원소가 존재하는지 확인
		System.out.println(contains);

		Person toDelete = new Person("희동");
		while (list.contains(toDelete)) {
			list.remove(toDelete);
		}

		System.out.println(list);

		list.clear();// 리스트 내 모든 원소 삭제
		contains = list.contains(new Person("희동"));// 원소가 존재하는지 확인
		System.out.println(contains);
		System.out.println(list);
	}

}
