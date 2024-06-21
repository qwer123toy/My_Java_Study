package Array2;

import java.util.Arrays;
import java.util.Random;

public class TestSearch3 {
	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 8, 12, 15, 27, 33, 40 };

		System.out.println(Arrays.toString(numbers));
		
		//이진 검색
		System.out.println(Arrays.binarySearch(numbers, 15));
		

	}
}
