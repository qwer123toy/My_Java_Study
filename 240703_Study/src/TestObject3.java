
public class TestObject3 {
	public static void main(String[] args) {

		Bird b1 = new Bird(3);
		Bird b2 = new Bird(3);
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		Bird b3 = new Bird(5);
		System.out.println(b1.equals(null));
		System.out.println(b1.equals(new String("¹®ÀÚ¿­")));
		
	}
}
