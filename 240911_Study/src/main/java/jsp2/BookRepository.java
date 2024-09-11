package jsp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class BookRepository {
	private List<Book> list;


	public BookRepository() {
		list = new ArrayList<>();
		list.add(new Book("Java", 12000));
		list.add(new Book("JavaScript", 13000));
		list.add(new Book("Java", 18000));
		list.add(new Book("HTML", 10000));
		list.add(new Book("CSS", 19000));
	}

	public Book find(Book target) {
		for(Book b : list) {
			if(b.equals(target)) {
				return b;
			}
		}
		return null;
	}

	public List<Book> getList() {
		return list;
	}


	public void setList(List<Book> list) {
		this.list = list;
	}
	
	
	
}













