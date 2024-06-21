package Quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {

		int[] arr = { 12, 10, 4, 17, 6, -1, 3, 1, 2 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int change = arr[i];
					arr[i] = arr[j];
					arr[j] = change;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
