
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
		System.out.println("������ �Է��ϼ���");
		String title = scanner.nextLine();
		System.out.println("�ۼ��ڸ��� �Է��ϼ���");
		String writer = scanner.nextLine();
		System.out.println("�߿䵵(����)�� �Է��ϼ���");
		int priority = scanner.nextInt();
		scanner.nextLine();
		System.out.println("������ �Է��ϼ���");
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
		System.out.println("���� ������ �Է����ּ���. 1. �߿䵵 ��, 2. ���� ��");
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
		System.out.println("�˻� ����� �̱����Դϴ�.");
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








