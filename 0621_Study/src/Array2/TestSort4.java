package Array2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TestSort4 {
	public static void main(String[] args) {
		// 중복이 없는 정수 6개 랜덤 생성하여 크기순 출력
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
//		int[] num = new int[6];
//		for (int i = 0; i < 6; i++) {
//			num[i] = r.nextInt(45)+1;
//		}
		int[] num = { 4, 3, 5, 4, 7, 5 };

		for (int i = 0; i < 6; i++) {
			for (int j = 5; j > i; j--) {
				if (num[i] == num[j]) {
					num[j] = r.nextInt(10);
				}

			}

		}
		System.out.println(Arrays.toString(num));
//		Arrays.sort(num);
//		System.out.println(Arrays.toString(num));

	}
}
