import java.util.Objects;

public class TestEquality3 {
	public static void main(String[] args) {
		String hello1 = "HELLO";
		String hello2 = "HELLO";
		String hello3 = new String("HELLO");
		
		boolean e = Objects.equals(hello1, hello2);
		System.out.println(e);
		
	}
}
