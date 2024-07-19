import java.util.Arrays;
import java.util.List;

class Phone {
}

class SamsungPhone extends Phone {
}

class IPhone extends Phone {
}

public class TestWildCards {

	// 모든 형식이 가능(오브젝트를 상속받았기 때문)
	public static <T> void wildCard(List<? extends Object> objList) {

		for (Object o : objList) {
			System.out.println(o.toString());
		}
	}

	public static void getSum(List<? extends Number> list) {

		double sum = 0;
		for (Number n : list) {
			sum += n.doubleValue();
		}
		// return sum;
	}

	// 와일드 카드, 하나의 타입을 나타내는데 어떠한 클래스를 상속 받아와야됨
	public static <T> void printAll(List<T> phoneList) {

	}

	public static void main(String[] args) {
		List<SamsungPhone> samsungs = null;
		List<IPhone> iphones =  Arrays.asList(new IPhone(), new IPhone());

		List<Integer> list = Arrays.asList(10, 20, 30);
		List<Double> list2 = Arrays.asList(10.2, 20.3, 30.1);
		List<String> list3 = Arrays.asList("asd", "asd");
		List<Long> list4 = Arrays.asList(1L, 2L);
		List<List<SamsungPhone>> list5 = Arrays.asList(samsungs);
		
		List<List<? extends Phone>> list6 = Arrays.asList(iphones);
		int a = 0;
		Integer b;
		b=a;
		getSum(list);
		// System.out.println(list);
		getSum(list2);
//		getSum(list3);
		getSum(list4);
//		getSum(list5);

		wildCard(list);
		wildCard(list2);
		wildCard(list3);
		wildCard(list4);
//		wildCard(list5);
		wildCard(list6);

		printAll(samsungs);
		printAll(iphones);
//		printAll(list);
	}
}
