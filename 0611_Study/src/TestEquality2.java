
public class TestEquality2 {
	public static void main(String[] args) {
		String hello1 = "HELLO";
		String hello2 = "HELLO";
		String hello3 = new String("HELLO");
		
		System.out.println(hello1.equals(hello3));
		
	}
}
