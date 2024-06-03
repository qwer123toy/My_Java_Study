import java.util.Scanner;

public class Control9 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();

		if (score < 0 || score > 100) {
			System.out.println("점수는 0~100 사이로 입력하세요");
		} else if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else {
			System.out.printf("D학점");
		}

	}
}
