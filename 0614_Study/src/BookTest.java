//책
//제목
//작가명
//가격
public class BookTest {
	
	public static void main(String[] args) {
		Book b = new Book("아프니까 청춘이다","김난도",13000);
		b.setPrice(14000);
		Book anotherB = b;
		anotherB.setPrice(15000);

		System.out.println(b.getPrice());
		System.out.println(anotherB.getPrice());
	}
}
