package Quiz;

import java.util.Scanner;

public class TestDocumentManage {
	public static void main(String[] args) {
		System.out.println("문서 관리 프로그램을 실행합니다.");
		DocManagemnetProgram d = new DocManagemnetProgram();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n====================");
			System.out.println("동작할 작업을 선택하세요.");
			System.out.println("1. 문서 등록");
			System.out.println("2. 문서 목록 보기");
			System.out.println("3. 문서 검색 및 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("입력 : ");
			
			String choose = sc.next();
			sc.nextLine();
			switch (choose) {
			case "1":
				d.registrationDocument();
				break;
			case "2":
				d.showDocumentList();
				break;
			case "3":
				d.findDocument();
				break;
			case "0":
				System.out.println("시스템을 종료합니다.");
				return;
			default:
				System.out.println("올바른 입력을 하세요.");
				break;
			}
		}

	}
}
