import java.util.Scanner;

//단수를 입력 받아 구구단 출력
public class Loop2 {
	public static void main(String[] args) {
		
		
		

		Scanner sc = new Scanner(System.in);
		System.out.print("구구단 단수 입력 : ");
		int num = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num * i);
		}
		
	
		
	}
}
