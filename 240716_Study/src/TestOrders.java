import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestOrders {
	public static void main(String[] args) {
		List<Integer> number = new ArrayList<>();

		number.add(100);
		number.add(50);
		number.add(1);
		number.add(13);
		number.add(7);

		System.out.println(number);

		Collections.sort(number);
		System.out.println(number);
		Collections.sort(number, Collections.reverseOrder());//역순
		System.out.println(number);
		
		Collections.shuffle(number); //랜덤하게 정렬
		System.out.println(number);
	}
}
