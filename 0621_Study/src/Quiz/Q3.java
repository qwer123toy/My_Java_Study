package Quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		// 중복이 없는 정수 6개 랜덤 생성하여 크기순 출력
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("숫자 입력");
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		int[] index = new int[10]; 
		int[] copy = Arrays.copyOf(arr, arr.length);
		
		for (int i = 0; i < arr.length; i++) { //반복을 통해 
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					index[i]++;
					//copy[j] = 0;
					copy[j]--;
				}
			}

		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == copy[i]+1) {
				index[i] = 0;
			}else {
				index[i] += 1;
			}
		}

		int[][] real = { copy, index };
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.toString(index));
		
		for (int i = 0; i < 10; i++) {
			if (real[1][i] != 0)
				System.out.println(real[0][i] + " : " + real[1][i] + "번");
		}

	}
}
