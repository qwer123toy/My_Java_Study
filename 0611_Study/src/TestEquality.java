
public class TestEquality {
	public static void main(String[] args) {
		String hello = "HELLO";
		String world = "WORLD";
		String he = "HE";
		String llo = "LLO";
		String concat = he + llo;
		System.out.println(hello==concat);
		System.out.println(hello.equals(concat));
		
		
	}
}
