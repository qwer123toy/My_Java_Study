package Quiz;

// GUI 프로그램에서
// 사용자가 배경색을 지정할 수 있고
// 선택한 배경색을 '환경설정 파일'로 저장하여
// 프로그램 재실행 시, 설정한 배경색이 표현되는 프로그램

public class Q { // 디버깅, 흐름이 되는지 확인

	public static int fibonacci(int n) {
		if (n < 2) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}

	public static void main(String[] args) {
//		for (int i = 0; i < 30; i++) {
//			int fibonacci = fibonacci(i);
//			System.out.println(fibonacci);
//		}

		System.out.println(factorial(10));
	}
}
