package Quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		// 중복이 없는 정수 6개 랜덤 생성하여 크기순 출력
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int[] num = new int[6];
		for (int i = 0; i < 6; i++) {
			num[i] = r.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					num[i] = r.nextInt(45) + 1;
					j = -1;
				}
			}
		}
		Arrays.sort(num);
		System.out.println(Arrays.toString(num));

	}

}
