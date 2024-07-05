import java.util.Arrays;
import java.util.Comparator;

interface IntMethod {
	int myMethod(int a, int b);
}


class SumCal implements IntMethod {
	public int myMethod(int a, int b) {
		return a + b;
	}
}

class MinusCal implements IntMethod {
	public int myMethod(int a, int b) {
		return a - b;
	}
}

public class TestLocalClass4 {
//	public static void printResult(SumCal obj) {
//		int result = obj.myMethod(10, 5);
//		System.out.println(result);
//	}

	public static void printResult(IntMethod intMethod) {
		int result = intMethod.myMethod(10, 5);
		System.out.println(result);
	}

	public static void main(String[] args) {
//		printResult(new SumCal());
//		printResult(new MinusCal());

		printResult(new IntMethod() {

			@Override
			public int myMethod(int a, int b) {
				// TODO Auto-generated method stub
				return a + b;
			}
		});
		
		//자바 -> 객체지향 언어
		//익명 클래스 -> 객체 지향이 아님
		//결론 -> 잘 안씀
		//but -> 알아는 놔라
		
		printResult(new IntMethod() {

			@Override
			public int myMethod(int a, int b) {
				// TODO Auto-generated method stub
				return a - b;
			}
		});

	}

}
