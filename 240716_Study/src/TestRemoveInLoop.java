import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestRemoveInLoop {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "cat", "dog", "Melon"));
		// 위 리스트에서 길이가 3인 문자열 제거

//		for (int i = 0; i < fruits.size(); i++) {
//			String elem = fruits.get(i);
//			if (elem.length() == 3)
//				fruits.remove(i);// cat을 인덱스 번호로 삭제하면 dog의 index 번호가 감소하면서 dog 인덱스값이 i보다 작아짐
//		}
//		for(String elem : fruits) {
//			if (elem.length() == 3)
//				fruits.remove(elem);
//		} // java.util.ConcurrentModificationException 에러 발생
		
		//Iterator를 사용하여 문자열 제거 반복 가능
		Iterator<String> iterator = fruits.iterator();
		while(iterator.hasNext()) {
			String elem = iterator.next();
			if (elem.length() == 3)
				iterator.remove();
		}
		
		System.out.println(fruits);

	}

}
