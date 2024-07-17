import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Book implements Comparator<Book> {
	private String title;
	private int price;

	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	int getPrice() {
		return price;
	}

	void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Book))
			return false;
		Book other = (Book) obj;
		return price == other.price && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}

public class TestMySet2 {
	public static void main(String[] args) {
		Set<Book> set = new HashSet<>();
		set.add(new Book("제목1", 10000));
		set.add(new Book("제목1", 10000));
		set.add(new Book("제목1", 10000));

		System.out.println(set);

	}
}
