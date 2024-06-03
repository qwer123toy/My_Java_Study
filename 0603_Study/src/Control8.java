import java.util.Scanner;

public class Control8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("번호입력(1번/2번) : ");
		int num = sc.nextInt();

		if (num == 1) {
			System.out.println("콜라는 1800원");
		} else if (num == 2) {
			System.out.println("사이다는 1600원");
		} else {
			System.out.printf("ERROR");
		}

	}
}
