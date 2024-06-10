import java.util.Scanner;

public class ScannerInput {
	public static void main(String[] args) {
		// 연산자 입력 받아 계산
		// 

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력");
		int num = sc.nextInt();
		
		System.out.println("문자열 입력");
		sc.nextLine();
		String operator = sc.nextLine();

		System.out.println(num);
		System.out.println(operator);
	}
}
