package Array2;

import java.util.Arrays;

public class TestSort2 {
	public static void main(String[] args) {

		int[] num = { 3, 1, 7, 12, 8 };

		int[] copy = Arrays.copyOf(num, num.length);
		Arrays.sort(copy);
		int[] reversed = new int[num.length];
		for (int i = 0; i < num.length; i++) {
			reversed[num.length - 1 - i] = copy[i];
		}
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(reversed));
	}
}
