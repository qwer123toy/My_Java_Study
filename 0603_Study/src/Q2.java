import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력 : ");
		int num = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num <= num2) {
			if (num2 <= num3) 
				System.out.printf("가장 큰 수는 %d",num3);
			else
				System.out.printf("가장 큰 수는 %d",num2);
		} else if (num <= num3)
				System.out.printf("가장 큰 수는 %d",num3);
		else
			System.out.printf("가장 큰 수는 %d",num);
			
	}
}
