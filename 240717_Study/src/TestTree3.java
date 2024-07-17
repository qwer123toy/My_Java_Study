import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestTree3 {
	public static void main(String[] args) {

		Comparator<Book> priceComp = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub

				return o1.getPrice() - o2.getPrice();
			}

		};

		Comparator<Book> titleComp = new Comparator<Book>() {

			@Override
			public int compare(Book o1, Book o2) {
				// TODO Auto-generated method stub

				return o1.getTitle().compareTo(o2.getTitle());
			}

		};

		Set<Book> set = new TreeSet<>(priceComp.thenComparing(titleComp));//값이 같은 경우에는 뒤에 있는 방식으로 비교
		
		set.add(new Book("제목1", 10000));
		set.add(new Book("제목1", 10000));

		set.add(new Book("제목1", 15000));

		set.add(new Book("제목2", 10000));
		set.add(new Book("제목3", 5000));

		System.out.println(set);

	}
}
