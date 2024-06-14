//책
//제목
//작가명
//가격
public class TestString {

	public static void main(String[] args) {
		String word = "Apple";
		String apple = "Apple";

		String instance = new String("Apple");
		
		System.out.println(word == instance);
		System.out.println(word == apple);
	}
}
