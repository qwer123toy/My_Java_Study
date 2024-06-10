import java.util.Scanner;

public class TestDoWhile2 {
	public static void main(String[] args) {
		// 1. 콜라(1500) 2. 사이다 1400

		boolean go = true;
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.println("정수 입력");

			num = sc.nextInt();
		} while (num != 0);
	}
}
