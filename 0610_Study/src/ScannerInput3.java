import java.util.Scanner;

public class ScannerInput3 {
	public static void main(String[] args) {
		// 연산자 입력 받아 계산
		// 

		Scanner sc = new Scanner(System.in);

		System.out.println("정수 입력");
		
		int num = sc.nextInt();
		
		System.out.println("문자열 입력");
		
		String line = sc.next();
		String line2 = sc.next();
		String line3 = sc.next();
		
		System.out.println(line);
		System.out.println(line2);
		System.out.println(line3);
	}
}

