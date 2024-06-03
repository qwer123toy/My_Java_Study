import java.util.Scanner;

public class Control7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		if (num < 0 || num > 100) {
			System.out.println("ERROR! 0부터 100 사이 숫자를 입력하시오.");
		} else {
			System.out.printf("OK");
		}

	}
}
