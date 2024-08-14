import java.util.Scanner;

//사용자에게 책 정보 입력 받아서 DB 행으로 추가
public class MyBookApp {
	public static void main(String[] args) {
		BookRepository repo = new BookRepository();
		Scanner sc = new Scanner(System.in);
		System.out.print("책 제목 입력 : ");
		String title = sc.nextLine();
		System.out.print("책 저자 입력 : ");
		String publisher = sc.nextLine();
		System.out.print("책 가격 입력 : ");
		int price = sc.nextInt();
		
		repo.insertBook(title, publisher, price);
		
		repo.showBook();
	}
}
