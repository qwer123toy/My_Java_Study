import java.util.Scanner;

public class TestSwitch2 {
	public static void main(String[] args) {
		// 1. 콜라(1500) 2. 사이다 1400

		Scanner sc = new Scanner(System.in);
		System.out.println("일수를 알고 싶은 달 입력");


		int choose = sc.nextInt();

		switch (choose) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31일");
			break;
		case 2:
			System.out.println("28일");
			break;
		case 4: case 6: case 9:  case 11:     
			System.out.println("31일");
			break;
		default :
			System.out.println("잘못된 번호입니다.");
			break;
		}
	}
}
