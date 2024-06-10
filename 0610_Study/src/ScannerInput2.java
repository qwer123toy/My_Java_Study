import java.util.Scanner;

public class ScannerInput2 {
	public static void main(String[] args) {
		// 연산자 입력 받아 계산
		// 

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		
		System.out.println("문자열 2줄 입력");
		
		sc.nextLine();
		String line = sc.nextLine();
		String line2 = sc.nextLine();
		
		System.out.println(line);
		System.out.println(line2);
	}
}

