
//1. 상속(Inheritance)? 기존 클래스(부모 클래스)의 속성과 메소드를 새로운 클래스(자식 클래스)에 물려주는 것
//2. 기존의 클래스에서 상속으로 파생된 클래스를 무엇이라고 부르나? 자식 클래스
//3. Super 클래스에서 private 멤버는 자식 클래스에서 접근이 가능한가? 불가능함, protected를 이용하여 접근은 가능
//4. Java에서 다중 상속(부모 클래스가 여럿)은 가능한가? 자식 클래스가 여럿인것은 가능하지만 부모 클래스가 여럿인거는 불가능
//5. 메소드 재정의(Override) 하고자 할 때, Super 클래스의 인스턴스 메소드와 동일하게 적어야 하는 것?
// - 메소드 이름, 매개변수 리스트, 리턴 타입, 접근 제어자
//6. 메소드 재정의 의도를 컴파일러에게 알리는 방법? @Overide를 명시적으로 표기
//7. 종단(final) 클래스? 상속을 할 수 없는 클래스
//8. 부모클래스의 생성자를 명시적으로 호출하지 않는 경우, 어떠한 생성자가 호출되는가? 부모 클래스의 기본 생성자가 호출됨


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
		
		Book[] b = {new Magazine("아프니까 청춘이다", 300, "김난도", "2024-07-02"), new VoiceBook("아프면 환자야 미친놈아", 200, "김난레", "2024-07-03")};
		Bookshelf bookshelf = new Bookshelf(b);
		System.out.println("보관된 책 개수 : " + bookshelf.HowManyBooks());
		//System.out.println(bookshelf.getBook()[0].getName());
	}

}
