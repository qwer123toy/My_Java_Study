import java.util.Scanner;

// 별 그리기

public class Stars {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("마름모 크기 입력 :");
		int num = sc.nextInt();
		int line = num/2;
		
		if(num%2==0) {
			for (int i = 0; i < line; i++) {
				for (int j = line; j >= i; j--)
					System.out.print(" ");
				for (int k = 0; k < i; k++) {
					System.out.print("*");
					System.out.print("*");
				}
				System.out.println("*");
			}
			for (int i = 1; i <= line; i++) {
				for (int l = 0; l <= i; l++)
					System.out.print(" ");
				for (int k = line; k >= i; k--) 
					System.out.print("*");
				for (int j = line; j > i; j--)
					System.out.print("*");
				System.out.println();
			}
		}
		else {
			for (int i = 0; i < line; i++) {
				for (int j = line; j >= i; j--)
					System.out.print(" ");
				for (int k = 0; k < i; k++) {
					System.out.print("*");
					System.out.print("*");
				}
				System.out.println("*");
			}
			for (int i = 0; i <= line; i++) {
				for (int l = 0; l <= i; l++)
					System.out.print(" ");
				for (int k = line; k >= i; k--)
					System.out.print("*");
				for (int j = line; j > i; j--)
					System.out.print("*");
				System.out.println();
			}
		}

	}

}
