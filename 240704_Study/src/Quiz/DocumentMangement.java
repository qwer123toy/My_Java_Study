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
			System.out.println("프로그램 최대치인 10을 넘었습니다.");
			return;
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("\n====================");
		System.out.println("문서를 등록합니다.");
		System.out.println("문서의 작성자를 입력하세요");
		System.out.print("입력 : ");
		String name = sc.next();
		sc.nextLine();

		System.out.println("문서의 제목을 입력하세요");
		System.out.print("입력 : ");
		String title = sc.next();
		sc.nextLine();

		System.out.println("문서의 중요도를 입력하세요");
		System.out.print("입력 : ");
		int important = sc.nextInt();

		System.out.println("문서의 내용을 입력하세요");
		System.out.print("입력 : ");
		sc.nextLine();
		String contents = sc.nextLine();
		
		Document d = new Document(name, title, important, contents);
		document[docIndex] = d;
		docIndex++;
	}

	@Override
	public void showDocumentList() {
		System.out.println("\n====================");
		System.out.println("문서 목록을 보여드리겠습니다.");
		System.out.println("어떤 순으로 정렬할까요?");
		System.out.println("1. 중요도 순");
		System.out.println("2. 제목 순");
		System.out.print("입력 : ");
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
				System.out.println("목록이 없습니다.");
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
				System.out.println("목록이 없습니다.");

			}

			break;
		default:
			System.out.println("정상적인 접근이 아니므로 종료합니다.");
			break;
		}

	}

	@Override
	public void findDocument() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n====================");
		System.out.println("문서를 검색합니다.");
		System.out.println("찾으실 방법을 선택하세요.");
		System.out.println("1. 작성자로 찾기");
		System.out.println("2. 제목으로 찾기");
		System.out.print("입력 : ");
		String choose = sc.next();
		sc.nextLine();
		int count = 0;
		switch (choose) {

		case "1":
			System.out.println("\n====================");
			System.out.println("작성자로 찾기를 선택하셨습니다.");
			System.out.println("작성자를 입력하세요");
			System.out.print("입력 : ");
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
				System.out.println("검색하신 문서가 없습니다.");
			}
			break;

		case "2":
			System.out.println("\n====================");
			System.out.println("제목으로 찾기를 선택하셨습니다.");
			System.out.println("제목을 입력하세요");
			System.out.print("입력 : ");
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
				System.out.println("검색하신 문서가 없습니다.");
			}

			break;
		default:
			System.out.println("올바른 값을 입력하세요.");
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
//		return "문서 작성자 : " + name + "\n 문서제목 : " + title + "\n 중요도 : " + important + "\n 문서내용 :  " + contents
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