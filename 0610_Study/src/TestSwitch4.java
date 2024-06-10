import java.util.Scanner;

public class TestSwitch4 {
	public static void main(String[] args) {
		// 사용자에게 다음과 같은 형태의 주민등록번호를 입력받고
		// 남자인지 여자인지 판별

		Scanner sc = new Scanner(System.in);
		System.out.println("달의 영단어 입력(Jan, Feb...) 입력");


		String num = sc.nextLine();
		
		switch (num) {
		case "Jan":   
			System.out.println("1월");
			break;
		case "Feb":
			System.out.println("2월");
			break;
		default :
			System.out.println("잘못된 번호입니다.");
			break;
		}
	}
}
