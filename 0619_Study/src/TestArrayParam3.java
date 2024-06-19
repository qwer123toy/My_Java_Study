
public class TestArrayParam3 {

	public void printAll(int... numbers) {// 가변 길이 파라미터, 순서가 중요함(가변 길이는 항상 마지막)
		if(numbers ==null)
			return;
		
		for (int n : numbers) {
			System.out.println(n);
		}

	}

	public void printAll2(int[] numbers) {
		if(numbers ==null)
			return;
		
		for (int n : numbers) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {
		TestArrayParam3 t = new TestArrayParam3();
		t.printAll(1, 2, 3, 4, 5, 6);
		int a[] = { 1, 2, 3, 4, 5, 6 };
		t.printAll2(a);

	}
}
