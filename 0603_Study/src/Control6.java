import java.util.Scanner;

public class Control6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("500원 개수와 100원 개수 입력 : ");
		int five = sc.nextInt();
		int hun = sc.nextInt();

		if (five < 0 || hun < 0) {
			System.out.println("ERROR");
		} else {
			int result = five * 500 + hun * 100;
			System.out.printf("총 금액은 %d원입니다", result);
		}

	}
}
