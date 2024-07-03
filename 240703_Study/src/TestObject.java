
public class TestObject {
	public static void main(String[] args) {
		
		Object book = new Book("책",200,"작가이름");
		Object str = new String("문자열");
		Object duck = new Duck(3);
		//Object란 자바에 기본적으로 들어있는 객체라는 클래스
		//모든 클래스는 기본적으로 Object 클래스를 부모 클래스로 갖고 있음
		System.out.println(book.toString());
		System.out.println(str.toString());
		System.out.println(duck.toString());
	}
}
