import java.util.Scanner;

public class TestSwitch6 {
	public static void main(String[] args) {
		// 직사각형 밑변 높이 입력 받고
		// 문자열로 넓이 또는 둘레를 입력 받아
		// 연산 결과 출력

		Scanner sc = new Scanner(System.in);
		
		System.out.println("직사각형 밑변");
		int num = sc.nextInt();
		
		System.out.println("직사각형 높이");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("둘레? 넓이?");
		String check = sc.nextLine();
		switch (check) {
		case "둘레":   
			System.out.println(2*(num+num2));
			break;
		case "넓이":
			System.out.println(num*num2);
			break;
		default :
			System.out.println("잘못된 기호입니다.");
			break;
		}
	}
}
