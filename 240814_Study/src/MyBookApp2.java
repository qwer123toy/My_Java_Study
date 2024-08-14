import java.util.Scanner;

// DB 상에 존재하는 책 정보 중
// 필요한 책 검색을 할 수 있는 앱
// 1. 제목으로 검색 -> 책 목록
// 2. 가격 범위로 검색 ex) 10000 ~ 20000 -> 책 목록
// 
public class MyBookApp2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);   
		BookRepository repo = new BookRepository();
		System.out.print("책 제목 입력 : ");
		String title = sc.nextLine();
		// SELECT * FROM books WHERE title = '입력받은 책제목';
		// "SELECT * FROM books WHERE price between " + price1 + " and " + price2
		
		String sql = "SELECT * FROM books WHERE title = '" + title + "'";
		

		repo.findBookByName(title);
		
		System.out.print("책 가격 범위(최소값) 입력 : ");
		int priceMin = sc.nextInt();
		System.out.print("책 가격 범위(최대값) 입력 : ");
		int priceMax = sc.nextInt();
		repo.findBookByPrice(priceMin, priceMax);
	}
}
