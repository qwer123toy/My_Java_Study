
public class TestBook {
	public static void main(String[] args) {
		Book b = new Book("제목", 10000);
		Book c = new Book("제목", 10000);
		
		System.out.println(b.getTitle());
		System.out.println(b.equals(c));
		c.setTitle("제목2");
		System.out.println(b.equals(c));
	}
}
