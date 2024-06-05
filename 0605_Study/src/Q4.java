import java.util.Random;
import java.util.Scanner;

/*
	4. 피보나치수 나열하기(30개)
		1 1 2 3 5 8 13 ..
	5. 사용자에게 정수를 입력받아, 소수 여부를 확인 가능한 프로그램
	6. 특정 사용자만 사용할 수 있도록, 비밀번호를 확인하는 프로그램(제한된 기회를 제공)
*/
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 1;
		int num2 = 1;
		System.out.print(num1 + " ");
		System.out.print(num2 + " ");

		for (int i = 1; i <= 28; i++) {
			int num3 = num1 + num2;
			System.out.print(num3 + " ");
			num1 = num2;
			num2 = num3;

		}
	}
}
