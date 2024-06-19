
public class TestArrayParam {
	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int... numbers) {//가변 길이 파라미터
		int sum = 0;
		for (int n : numbers) {
			sum += n;
		}
		return sum;
	}
	

	public static void main(String[] args) {
		TestArrayParam t = new TestArrayParam();
		System.out.println(t.sum(100, 200));
		
		System.out.println(t.sum(300,40,50,60,70,80,90,1));
	}
}
