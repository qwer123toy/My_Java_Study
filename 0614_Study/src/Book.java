//책
//제목
//작가명
//가격
public class Book {
	//관련 있는 정보끼리(클래스의 필드, 메소드) 묶어주는 것을 객체의 캡슐화라고 함
	String title;
	String author;
	private int price; // 외부의 접근을 막음
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String Author) {
		this.author = Author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void main(String[] args) {
		
	}
}
