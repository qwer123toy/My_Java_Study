
public class ForLoop4 {

	public static void main(String[] args) {

		int a = 0;
		int b = 11;

		while (a < 10) {
			System.out.println(a + ", " + b);
			a++;
			b++;
		}

		for (int i = 0, j = 11; i < 10; i++, j++) {
			System.out.println(i + ", " + j);
		}
	}

}
