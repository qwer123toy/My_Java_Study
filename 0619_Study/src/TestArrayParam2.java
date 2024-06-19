
public class TestArrayParam2 {

	public void printAll(String word, int... numbers) {// 가변 길이 파라미터, 순서가 중요함(가변 길이는 항상 마지막)
		System.out.println(word);
		for (int n : numbers) {
			System.out.println(n);
		}

	}

	public static void main(String[] args) {
		TestArrayParam2 t = new TestArrayParam2();
		t.printAll("문자열", 1, 2, 3, 4, 5, 6);

	}
}
