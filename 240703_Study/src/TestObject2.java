
public class TestObject2 {
	public static void main(String[] args) {

		Object i = new Integer(100);
		Object j = new Integer(100);

		String str1 = new String("Hello");
		String str2 = new String("Hello");

		System.out.println(i == j);
		System.out.println(str1 == str2);
		System.out.println(i.equals(j));
		System.out.println(str1.equals(str2));
	}
}
