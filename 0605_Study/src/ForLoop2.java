
public class ForLoop2 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		for (int i = 10; i < 100; i++) {
			if (i / 10 == i % 10)
				System.out.println(i);
		}

	}

}
