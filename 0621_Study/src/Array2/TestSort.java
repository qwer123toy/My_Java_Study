package Array2;

import java.util.Arrays;
import java.util.Scanner;

public class TestSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("정수 입력");
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		System.out.println("최솟값 : " + num[0]);
		System.out.println("최댓값 : " + num[4]);

	}
}
