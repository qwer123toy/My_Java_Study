import java.util.Scanner;

/* 
 	1. 사용자가 입력한 값이 1~9이면 one, two 처럼 입력, 아니면 other
	2. 369 게임 1~50
	3. 3x+10y=100을 만족하는 모든 해를 구하기 0<=x<=10, 0<=y<=10
	
	4. 가위바위보 게임
	
	5. 숫자 야구 게임
*/
public class Q1 {

	public static void main(String[] args) {
		// 1. 콜라(1500) 2. 사이다 1400

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");

		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		default:
			System.out.println("Other");
			break;

		}
	}
}
