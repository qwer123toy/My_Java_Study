package Array2;

import java.util.Arrays;
import java.util.Random;

public class TestSearch2 {
	public static void main(String[] args) {

		int[] numbers = { 33, 36, 22, 14, 15, 30, 23 };

		System.out.println(Arrays.toString(numbers));
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 15) {
				System.out.println(i);
				break;
			}
		}

	}
}
