import java.util.Scanner;

public class Control5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 A, B 입력 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		if (num2 != 0) {
			System.out.println("A 나누기 B의 몫 : " + num1 / num2);
			System.out.println("A 나누기 B의 나머지 : " + num1 % num2);
		}

	}
}
