import java.util.Random;
import java.util.Scanner;

/*
	6. 특정 사용자만 사용할 수 있도록, 비밀번호를 확인하는 프로그램(제한된 기회를 제공)
*/
public class Q6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int password = 1234;
		int errorCount = 0;

		while (errorCount < 3) {
			System.out.print("비밀번호를 입력하세요 : ");
			int num = sc.nextInt();

			if (num != password) {
				errorCount++;
				System.out.printf("비밀번호를 틀렸습니다 다시 입력하세요. 남은 횟수 %d/3회\n", errorCount);
				if (errorCount == 3)
					System.out.println("비밀번호 최대 입력 횟수를 초과했습니다. 시스템을 종료합니다.");
			} else {
				System.out.println("환영합니다 사용자님.");
				break;
			}

		}
	}
}
