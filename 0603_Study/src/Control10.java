import java.util.Scanner;

public class Control10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("z음료수 양(정수) 입력 : ");
		int amount = sc.nextInt();

		if (amount < 100 || amount > 400) {
			System.out.println("100~400 사이로 입력하세요");
		} else if (amount >= 300) {
			System.out.println("Large");
		} else if (amount >= 200) {
			System.out.println("Mideum");
		} else {
			System.out.printf("Small");
		}

	}
}
