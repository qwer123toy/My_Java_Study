import java.util.Scanner;

public class Screen {

	private int checkManger; // admin 파라미터에서 확인 가능
	Scanner scanner = new Scanner(System.in);

	public void staffScreen() {
		Admin admin = new Admin();
		
		System.out.println("관리자 번호를 입력하세요");
		System.out.println("1. 지배인");
		System.out.println("2. 데스크 직원");
		System.out.println("3. 청소 직원");
		System.out.print("입력 : ");
		

		int input = scanner.nextInt();

		switch (input) {
		case 1:
			System.out.println("관리자(지배인) 메뉴 화면입니다.");
			while(true) {
			admin.AdminProcess(input);
			}
			

		case 2:
			System.out.println("데스크 직원 메뉴 화면입니다.");
			while(true) {
			admin.AdminProcess(input);
			}
			

		case 3:
			System.out.println("청소부 메뉴 화면입니다.");
			while(true) {
			admin.CleanerProcess();
			}
		
			
		default:
			System.out.println("다시 입력하세요.");
			break;
		}

		// 지배인/ 데스크직원 / 청소부

	}
}