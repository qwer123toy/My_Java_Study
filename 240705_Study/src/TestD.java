
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PriorityComparator implements Comparator<Document2> {
	@Override
	public int compare(Document2 o1, Document2 o2) {
		return o1.getPriority() - o2.getPriority();
	}
}

class TitleComparator2 implements Comparator<Document2> {
	@Override
	public int compare(Document2 o1, Document2 o2) {
		return o1.getTitle().compareTo(o2.getTitle());
	}
}

class Document2 {
	private String title;
	private String writer;
	private int priority;
	private String content;
	
	public Document2(String title) {
		super();
		this.title = title;
	}
	
	public Document2(int priority) {
		super();
		this.priority = priority;
	}
	
	public Document2(String title, String writer, int priority, String content) {
		super();
		this.title = title;
		this.writer = writer;
		this.priority = priority;
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Document2 [title=" + title + ", writer=" + writer + ", priority=" + priority + ", content=" + content
				+ "]";
	}
}

interface IDocumentManage {
	void registerDocument();
	void listDocument();
	void searchDocument();
}

class DocumentManage implements IDocumentManage {
	private Document2[] documents;
	private int currentIndex;
	private Scanner scanner;
	
	public DocumentManage() {
		documents = new Document2[5];
		scanner = new Scanner(System.in);
	}
	
	private Document2 createDocument() {
		System.out.println("제목을 입력하세요");
		String title = scanner.nextLine();
		System.out.println("작성자명을 입력하세요");
		String writer = scanner.nextLine();
		System.out.println("중요도(정수)를 입력하세요");
		int priority = scanner.nextInt();
		scanner.nextLine();
		System.out.println("내용을 입력하세요");
		String content = scanner.nextLine();
		
		return new Document2(title, writer, priority, content);
	}
	
	@Override
	public void registerDocument() {
		if (currentIndex < documents.length) {
			documents[currentIndex] = createDocument();
			currentIndex++;
		}
	}

	@Override
	public void listDocument() {
		System.out.println("정렬 기준을 입력해주세요. 1. 중요도 순, 2. 제목 순");
		int sortWay = scanner.nextInt();
		extracted(sortWay);
		for (Document2 d : documents) {
			System.out.println(d);
		}
	}

	private void extracted(int sortWay) {
		if (sortWay == 1) {
			Arrays.sort(documents, Comparator.nullsLast(new PriorityComparator()));
		} else if (sortWay == 2) {
			Arrays.sort(documents, Comparator.nullsLast(new TitleComparator2()));
		}
	}

	@Override
	public void searchDocument() {
		System.out.println("검색 기능은 미구현입니다.");
	}
}

public class TestD {
	public static void main(String[] args) {
		DocumentManage manager = new DocumentManage();
		manager.registerDocument();
		manager.registerDocument();
		
		manager.listDocument();
	}
}








