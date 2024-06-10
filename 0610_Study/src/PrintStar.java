import java.util.Scanner;

//사용자에게 국영수 점수를 입력 받아 총점을 출력
public class PrintStar {

	public static void printStar(int num) {
		for (int j = num; j >= 1; j--) {
			for (int i = 0; i < j; i++)
				System.out.print("*");
			System.out.println();
		}
	}

	public static void main(String[] args) {

		printStar(5);

	}
}
