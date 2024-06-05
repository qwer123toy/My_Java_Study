import java.util.Random;
import java.util.Scanner;

/*

	5. 사용자에게 정수를 입력받아, 소수 여부를 확인 가능한 프로그램
	6. 특정 사용자만 사용할 수 있도록, 비밀번호를 확인하는 프로그램(제한된 기회를 제공)
*/
public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int i = 2;
		
		for (; i < num; i++) {
			if (num % i == 0) {
				System.out.printf("%d은(는) 소수가 아닙니다", num);
				break;
			}
		}
		if (i == num)
			System.out.printf("%d은(는) 소수입니다", num);

	}
}
