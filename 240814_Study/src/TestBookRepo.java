
public class TestBookRepo {
	public static void main(String[] args) {
		BookRepository repo = new BookRepository();
//		int result = repo.insertBook("책이름", "B 출판사", 10000);
//		
//		System.out.println(result + "행이 추가됨을 확인");
		repo.insertBook("다른책", "C출판사", 20000);
	}
}
