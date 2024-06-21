package Array2;

import java.util.Arrays;
import java.util.Random;

public class TestSearch4 {
	public static void main(String[] args) {

		int[] numbers = { 15, 2, 66, 3, 20, 33, 7, 8 };

		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.binarySearch(numbers, 15));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.binarySearch(numbers, 887));

	}
}
