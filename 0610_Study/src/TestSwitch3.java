import java.util.Scanner;

public class TestSwitch3 {
	public static void main(String[] args) {
		// 사용자에게 다음과 같은 형태의 주민등록번호를 입력받고
		// 남자인지 여자인지 판별

		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력");


		String num = sc.nextLine();
		
		char checkGender = num.charAt(num.length()-1);
		
		switch (checkGender) {
		case '1': case '3':  
			System.out.println("남");
			break;
		case '2': case '4': 
			System.out.println("여");
			break;
		default :
			System.out.println("잘못된 번호입니다.");
			break;
		}
	}
}
