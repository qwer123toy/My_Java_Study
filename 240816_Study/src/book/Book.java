package book;

// 240816 수업

// BookRepository 클래스의 resultMapping 메소드에 
// Book 객체를 만들기 위한 Book 클래스 

public class Book {

	private int bookId;
	private String title;
	private String publisher;
	private int price;

	// 생성자
	public Book(int bookId, String title, String publisher, int price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.publisher = publisher;
		this.price = price;
	}

	// getter setter
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// toString
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", publisher=" + publisher + ", price=" + price + "]";
	}
}