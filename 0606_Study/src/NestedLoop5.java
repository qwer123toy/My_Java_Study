import java.util.Scanner;

// 2의 제곱수 5개 나욜
// 점수 개수를 입력 받아 
// 총점을 구하는 프로그램
// 예) 과목수? 4
// 100 90 80 70
// 총합 : 340

public class NestedLoop5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 2; i <= 4; i++) {
			int pow = 1;
			for (int j = 0; j < i; j++) {
				pow *= i;
				System.out.print(pow + " ");

			}
			System.out.println();
		}

	}

}
