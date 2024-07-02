class Worker extends Human{
	private String position;
	public Worker(String name, int age, String position) {
		super(name, age);
		this.position = position;
	}
	
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
}

class Author extends Human{
	
	private String bookTitle;
	
	
	public Author(String name, int age, String bookTitle) {
		super(name, age);
		this.bookTitle = bookTitle;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	
}

public class TestPerson2 {
	public static void main(String[] args) {
		
	}

}
