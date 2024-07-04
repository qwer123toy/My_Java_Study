package Quiz;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public interface DocumentMangement {
	public void registrationDocument();

	public void showDocumentList();

	public void findDocument();
}


class ImportantComparator implements Comparator<Document> {

	@Override
	public int compare(Document o1, Document o2) {
		
		if(Objects.nonNull(o1) && Objects.nonNull(o2)) {
		int left = o1.getImportant();
		int right = o2.getImportant();
		return left - right;
		}
		return 0;
	}

}

class TitleComparator implements Comparator<Document> {

	@Override
	public int compare(Document o1, Document o2) {
		if(Objects.nonNull(o1) && Objects.nonNull(o2)) {
		String leftname = o1.getName();
		String rightname = o2.getName();
		return leftname.compareTo(rightname);
		}
		return 0;
	}

}

class DocManagemnetProgram implements DocumentMangement {
	static Document[] document = new Document[10];
	static int docIndex = 0;

	@Override
	public void registrationDocument() {
		if (docIndex >= 10) {
			System.out.println("���α׷� �ִ�ġ�� 10�� �Ѿ����ϴ�.");
			return;
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("\n====================");
		System.out.println("������ ����մϴ�.");
		System.out.println("������ �ۼ��ڸ� �Է��ϼ���");
		System.out.print("�Է� : ");
		String name = sc.next();
		sc.nextLine();

		System.out.println("������ ������ �Է��ϼ���");
		System.out.print("�Է� : ");
		String title = sc.next();
		sc.nextLine();

		System.out.println("������ �߿䵵�� �Է��ϼ���");
		System.out.print("�Է� : ");
		int important = sc.nextInt();

		System.out.println("������ ������ �Է��ϼ���");
		System.out.print("�Է� : ");
		sc.nextLine();
		String contents = sc.nextLine();
		
		Document d = new Document(name, title, important, contents);
		document[docIndex] = d;
		docIndex++;
	}

	@Override
	public void showDocumentList() {
		System.out.println("\n====================");
		System.out.println("���� ����� �����帮�ڽ��ϴ�.");
		System.out.println("� ������ �����ұ��?");
		System.out.println("1. �߿䵵 ��");
		System.out.println("2. ���� ��");
		System.out.print("�Է� : ");
		Scanner sc = new Scanner(System.in);
		String choose = sc.next();
		sc.nextLine();

		switch (choose) {
		case "1":

			if (Objects.nonNull(document) && docIndex > 0) {
				System.out.println("\n====================");
				Arrays.sort(document, 0, docIndex, new ImportantComparator());
				for (int i = 0; i < docIndex; i++) {
					System.out.println(document[i].toString());
				}
			} else {
				System.out.println("����� �����ϴ�.");
			}

			break;
		case "2":
			if (Objects.nonNull(document) && docIndex > 0) {

				System.out.println("\n====================");
				//Arrays.sort(document, 0, docIndex, new TitleComparator());
				Arrays.sort(document, new TitleComparator());
				for (int i = 0; i < docIndex; i++) {
					System.out.println(document[i].toString());
				}
			} else {
				System.out.println("����� �����ϴ�.");

			}

			break;
		default:
			System.out.println("�������� ������ �ƴϹǷ� �����մϴ�.");
			break;
		}

	}

	@Override
	public void findDocument() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n====================");
		System.out.println("������ �˻��մϴ�.");
		System.out.println("ã���� ����� �����ϼ���.");
		System.out.println("1. �ۼ��ڷ� ã��");
		System.out.println("2. �������� ã��");
		System.out.print("�Է� : ");
		String choose = sc.next();
		sc.nextLine();
		int count = 0;
		switch (choose) {

		case "1":
			System.out.println("\n====================");
			System.out.println("�ۼ��ڷ� ã�⸦ �����ϼ̽��ϴ�.");
			System.out.println("�ۼ��ڸ� �Է��ϼ���");
			System.out.print("�Է� : ");
			String author = sc.next();
			sc.nextLine();

			for (int i = 0; i < document.length; i++) {
				if (Objects.isNull(document[i])) {
					break;
				} else {
					if (document[i].getName().equals(author)) {
						System.out.println(document[i].toString());
						count++;
					}
				}
			}
			if (count == 0) {
				System.out.println("�˻��Ͻ� ������ �����ϴ�.");
			}
			break;

		case "2":
			System.out.println("\n====================");
			System.out.println("�������� ã�⸦ �����ϼ̽��ϴ�.");
			System.out.println("������ �Է��ϼ���");
			System.out.print("�Է� : ");
			String title = sc.next();
			sc.nextLine();

			for (int i = 0; i < document.length; i++) {
				if (Objects.isNull(document[i])) {
					break;
				} else {
					if (document[i].getTitle().equals(title)) {
						System.out.println(document[i].toString());
						count++;
					}
				}
			}
			if (count == 0) {
				System.out.println("�˻��Ͻ� ������ �����ϴ�.");
			}

			break;
		default:
			System.out.println("�ùٸ� ���� �Է��ϼ���.");
			break;
		}

	}

}

class Document {
	private String name;
	private String title;
	private int important;
	private String contents;

	public Document(String name, String title, int important, String contents) {
		super();
		this.name = name;
		this.title = title;
		this.important = important;
		this.contents = contents;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	int getImportant() {
		return important;
	}

	void setImportant(int important) {
		this.important = important;
	}

	String getContents() {
		return contents;
	}

	void setContents(String contents) {
		this.contents = contents;
	}

	@Override
	public String toString() {
		return "Document [name=" + name + ", title=" + title + ", important=" + important + ", contents=" + contents
				+ "]";
//		return "���� �ۼ��� : " + name + "\n �������� : " + title + "\n �߿䵵 : " + important + "\n �������� :  " + contents
//				;
}

	@Override
	public int hashCode() {
		return Objects.hash(contents, important, name, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Document))
			return false;
		Document other = (Document) obj;
		return Objects.equals(contents, other.contents) && important == other.important
				&& Objects.equals(name, other.name) && Objects.equals(title, other.title);
	}

}