import java.util.Random;
import java.util.Scanner;


public class Q4 {
	public static void main(String[] args) {

		Random r = new Random();
		int numA1 = r.nextInt(6) + 1;
		int numA2 = r.nextInt(6) + 1;
		int numB1 = r.nextInt(6) + 1;
		int numB2 = r.nextInt(6) + 1;
		int sumA = numA1 + numA2;
		int sumB = numB1 + numB2;

		System.out.printf("A 주사위 값 : %d %d \n", numA1, numA2);
		System.out.printf("B 주사위 값 : %d %d \n", numB1, numB2);
		
		if (sumA > sumB)
			System.out.printf("A : %d, B : %d,   A 합계 승리 ", sumA, sumB);
		else if (sumA < sumB)
			System.out.printf("A : %d, B : %d,   B 합계 승리 ", sumA, sumB);
		else {
			if (numA1 == numB1) {
				System.out.println("무승부");
			}
			else if(numA1 == numA2)
				System.out.println("A 페어 승리");
			else if(numB1 == numB2)
				System.out.println("B 페어 승리");
			else
				System.out.println("무승부");
		}


	}
}
