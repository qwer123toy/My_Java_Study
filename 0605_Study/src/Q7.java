import java.util.Scanner;

/*
	7. 구구단 2~9단 출력
*/
public class Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}
}
