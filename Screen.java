import java.util.Scanner;

public class Screen {

	private int checkManger; // admin 파라미터에서 확인 가능
	Scanner scanner = new Scanner(System.in);

	public void staffScreen(Admin admin) {
		
		
		System.out.println("관리자 번호를 입력하세요");
		System.out.println("지배인 12, 데스크 34, 청소부 56");
		
		System.out.print("입력 : ");
		
		
		int input = scanner.nextInt();
		if (input == 12 || input == 34 || input == 56) {
			boolean go = true;
			switch (input) {
			case 12:
				System.out.println("관리자(지배인) 메뉴 화면입니다.");
				while (go) {
					go = admin.AdminProcess(input);
				}
				break;

			case 34:
				System.out.println("데스크 직원 메뉴 화면입니다.");
				while (go) {
					go = admin.AdminProcess(input);
				}
				break;
			case 56:
				System.out.println("청소부 메뉴 화면입니다.");
				while (go) {
					go = admin.CleanerProcess();
				}
				break;

			default:
				System.out.println("다시 입력하세요.");
				break;
			}
		} else {
			System.out.println("존재하지 않는 관리자 번호입니다.");
		}

		// 지배인/ 데스크직원 / 청소부

	}


}