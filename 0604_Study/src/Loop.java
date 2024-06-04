import java.util.Scanner;

//단수를 입력 받아 구구단 출력
public class Loop {
	public static void main(String[] args) {
		int j = 1;
//		while (j <= 10) {
//			System.out.println(j);
//			j++;
//		}
//
//		while (j <= 9) {
//			System.out.printf("%d * %d = %d\n", 2, j, 2 * j);
//			j++;
//		}

		for (int i = 0; i <= 3; i++) {
			for (j = 3; j >= i; j--) 
				System.out.print(" ");
			
			for (int k = 0; k < i; k++) 
				System.out.print("*");
			
			for (int l = 0; l < i; l++) 
				System.out.print("*");
			
			System.out.println("*");
		}

		for (int i = 1; i <= 3; i++) {
			for (int l = 0; l <= i; l++) 
				System.out.print(" ");
			
			for (int k = 3; k >= i; k--) 
				System.out.print("*");
			
			for (j = 3; j > i; j--) 
				System.out.print("*");
			

			System.out.println();
		}

	}
}
