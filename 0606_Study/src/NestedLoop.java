import java.util.Scanner;

public class NestedLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("별의 개수?");
		int stars = sc.nextInt();
		
		for (int j=0; j<stars; j++) {
			for (int k = stars; k >= j; k--)
				System.out.print(" ");
			
			for (int i = 0; i <= j; i++)
				System.out.print("*");
			
			for (int i = 0; i <= j; i++)
				System.out.print("*");
			System.out.println();
		}
		
	}
}
