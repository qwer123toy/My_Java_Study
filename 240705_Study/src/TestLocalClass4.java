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
		
		//�ڹ� -> ��ü���� ���
		//�͸� Ŭ���� -> ��ü ������ �ƴ�
		//��� -> �� �Ⱦ�
		//but -> �˾ƴ� ����
		
		printResult(new IntMethod() {

			@Override
			public int myMethod(int a, int b) {
				// TODO Auto-generated method stub
				return a - b;
			}
		});

	}

}
