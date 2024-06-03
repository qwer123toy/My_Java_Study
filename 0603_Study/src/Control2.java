import java.util.Scanner;

public class Control2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("짝수");

		} else {
			System.out.println("홀수");
		}

		System.out.println("종료!");

	}
}
