
public class ForLoop3 {

	public static void main(String[] args) {
//		int sum = 0;

//		for (int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);

		int count = 0;
		
		for (int i = 70; i <= 800; i++) {
			if (i % 2 == 0)
				count++;
		}
		System.out.println(count);

	}

}
