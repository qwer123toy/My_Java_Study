package Array2;

import java.util.Arrays;
import java.util.Random;

public class TestSearch {
	public static void main(String[] args) {

		Random r = new Random();

		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(30);
		}

		System.out.println(Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 15)
				System.out.println(i);
		}

	}
}
