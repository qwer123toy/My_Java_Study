package Quiz;

import java.util.Scanner;

public class TestDocumentManage {
	public static void main(String[] args) {
		System.out.println("���� ���� ���α׷��� �����մϴ�.");
		DocManagemnetProgram d = new DocManagemnetProgram();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n====================");
			System.out.println("������ �۾��� �����ϼ���.");
			System.out.println("1. ���� ���");
			System.out.println("2. ���� ��� ����");
			System.out.println("3. ���� �˻� �� ��ȸ");
			System.out.println("0. ���α׷� ����");
			System.out.print("�Է� : ");
			
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
				System.out.println("�ý����� �����մϴ�.");
				return;
			default:
				System.out.println("�ùٸ� �Է��� �ϼ���.");
				break;
			}
		}

	}
}
