import java.util.Scanner;

public class TestSwitch5 {
	public static void main(String[] args) {
		// 연산자 입력 받아 계산
		// 

		Scanner sc = new Scanner(System.in);
		
		System.out.println("연산자 입력");
		String operator = sc.nextLine();
		
		System.out.println("첫번째 정수");
		int num = sc.nextInt();
		
		System.out.println("두번째 정수");
		int num2 = sc.nextInt();
		
		switch (operator) {
		case "+":   
			System.out.println(num+num2);
			break;
		case "-":
			System.out.println(num-num2);
			break;
		case "*":
			System.out.println(num*num2);
			break;
		case "/":
			System.out.println(num/num2);
			break;
		default :
			System.out.println("잘못된 기호입니다.");
			break;
		}
	}
}
