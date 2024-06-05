import java.util.Random;
import java.util.Scanner;

public class ForLoop6 {
//정수의 시작과 끝을 입력하면 모든 정수를 나열 후 총합 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random r = new Random();

		for (int i = 0; i <= 5; i++) {
			int num = r.nextInt(45) + 1;
			System.out.println(num);

		}
	}
}
