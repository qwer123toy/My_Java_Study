import java.util.Scanner;

//책 잊지말고 Happy happy Thing!
//제목
//작가명
//가격
public class InputUserName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String firstName = sc.nextLine();
		System.out.print("성 입력 : ");
		String lastName = sc.nextLine();

		// '통과' | 잘못 입력
		// 공백이 있으면 안됨 fir
		// 각 이름은 1~10자
		if (firstName.indexOf(" ") != -1) {
			System.out.println("잘못된 입력");
			System.out.println("이름에 공백이 들어가면 안됩니다.");
		} else if (firstName.length() > 10 || firstName.length() < 1 || lastName.length() > 10
				|| lastName.length() < 1) {
			System.out.println("잘못된 입력");
			System.out.println("이름은 최소 1자~10자 사이로 입력하세요");
		} else {
			System.out.println("통과");
			System.out.println(lastName.substring(0, 1) + ". " + firstName.substring(0,1) + ".");
		}

	}
}
