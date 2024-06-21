package Quiz;

import java.util.Arrays;

public class Q1 {
	public static void main(String[] args) {
		int[] arr = { 1, 7, 7, 6, 5, 5, 2 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[i] == arr[j]) {
					arr[j] = 0;
					count++;
				}
			}

		}
		
		int[] copy = Arrays.copyOfRange(arr, 0, arr.length - count);
		
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				copy[j] = arr[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(copy));

	}
}
