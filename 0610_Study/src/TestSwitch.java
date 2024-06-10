import java.util.Scanner;

public class TestSwitch {
	public static void main(String[] args) {
		// 1. 콜라(1500) 2. 사이다 1400

		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");

		int choose = sc.nextInt();

		switch (choose) {
		case 1:
			System.out.println("1500원");
			break;
		case 2:
			System.out.println("1400원");
			break;
		default :
			System.out.println("잘못된 메뉴 번호입니다.");
			break;
		}
	}
}
