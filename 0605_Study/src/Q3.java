import java.util.Scanner;

/*
	3. 사용자에게 정수를 입력받아 팩토리얼 구하기
	4. 피보나치수 나열하기(30개)
		1 1 2 3 5 8 13 ..
	5. 사용자에게 정수를 입력받아, 소수 여부를 확인 가능한 프로그램
	6. 특정 사용자만 사용할 수 있도록, 비밀번호를 확인하는 프로그램(제한된 기회를 제공)
*/
public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int facto = sc.nextInt();
		int result = 1;

		for (int i = 1; i <= facto; i++) {
			result *= i;
		}
		
		System.out.printf("%d의 팩토리오 값은 %d입니다.", facto, result);
	}
}
