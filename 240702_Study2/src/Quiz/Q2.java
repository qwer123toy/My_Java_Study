
//1. ���(Inheritance)? ���� Ŭ����(�θ� Ŭ����)�� �Ӽ��� �޼ҵ带 ���ο� Ŭ����(�ڽ� Ŭ����)�� �����ִ� ��
//2. ������ Ŭ�������� ������� �Ļ��� Ŭ������ �����̶�� �θ���? �ڽ� Ŭ����
//3. Super Ŭ�������� private ����� �ڽ� Ŭ�������� ������ �����Ѱ�? �Ұ�����, protected�� �̿��Ͽ� ������ ����
//4. Java���� ���� ���(�θ� Ŭ������ ����)�� �����Ѱ�? �ڽ� Ŭ������ �����ΰ��� ���������� �θ� Ŭ������ �����ΰŴ� �Ұ���
//5. �޼ҵ� ������(Override) �ϰ��� �� ��, Super Ŭ������ �ν��Ͻ� �޼ҵ�� �����ϰ� ����� �ϴ� ��?
// - �޼ҵ� �̸�, �Ű����� ����Ʈ, ���� Ÿ��, ���� ������
//6. �޼ҵ� ������ �ǵ��� �����Ϸ����� �˸��� ���? @Overide�� ��������� ǥ��
//7. ����(final) Ŭ����? ����� �� �� ���� Ŭ����
//8. �θ�Ŭ������ �����ڸ� ��������� ȣ������ �ʴ� ���, ��� �����ڰ� ȣ��Ǵ°�? �θ� Ŭ������ �⺻ �����ڰ� ȣ���


package Quiz;
class Book {
	private String name;
	private int pages;
	private String author;
	public Book(String name, int pages, String author) {
		super();
		this.name = name;
		this.pages = pages;
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
}

class Magazine  extends Book{
	private String publishDate;

	public Magazine(String name, int pages, String author, String publishDate) {
		super(name, pages, author);
		this.publishDate = publishDate;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	
	
	
}
class VoiceBook extends Book{
	private String VoiceName;

	public VoiceBook(String name, int pages, String author, String voiceName) {
		super(name, pages, author);
		VoiceName = voiceName;
	}

	public String getVoiceName() {
		return VoiceName;
	}

	public void setVoiceName(String voiceName) {
		VoiceName = voiceName;
	}
	
}

class Bookshelf{
	private Book[] book;	

	public Bookshelf() {}
	public Bookshelf(Book[] book) {
		super();
		this.book = book;
	}

	public Book[] getBook() {
		return book;
	}

	public void setBook(Book[] book) {
		this.book = book;
	}

	public int HowManyBooks() {
		int count = 0;
		for( Book n : book) {
			count++;
		}
		return count;
	}
	
}



public class Q2 {
	public static void main(String[] args) {
		
		Book[] b = {new Magazine("�����ϱ� û���̴�", 300, "�賭��", "2024-07-02"), new VoiceBook("������ ȯ�ھ� ��ģ���", 200, "�賭��", "2024-07-03")};
		Bookshelf bookshelf = new Bookshelf(b);
		System.out.println("������ å ���� : " + bookshelf.HowManyBooks());
		//System.out.println(bookshelf.getBook()[0].getName());
	}

}
