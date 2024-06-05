import java.util.Random;
import java.util.Scanner;

//정수를 반복 입력하는 프로그램
//이때 입력된 자연수는 이전의 입력보다 커야함
//0보다 작거나 이전 입력보다 작은 경우 반복 종료
public class LoopControl2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num2 = 0;
		
		while(true) {
			System.out.print("자연수 입력 : ");
			int num = sc.nextInt();
			if (num <= 0 || num < num2) {
				System.out.println("종료");
				break;
			}
			else {
				num2 = num;
				System.out.println(num2);
			}
			
		}

	}
}
