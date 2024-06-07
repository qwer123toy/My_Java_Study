import java.util.Scanner;

// 2의 제곱수 5개 나욜
// 점수 개수를 입력 받아 
// 총점을 구하는 프로그램
// 예) 과목수? 4
// 100 90 80 70
// 총합 : 340

public class NestedLoop6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력?");
		int num = sc.nextInt();
		outerLoop :
		for (int j = 1; j <= num; j++) {
			for (int i = 1; i <= num; i++) {
				System.out.printf("(%d, %d) ", j, i);
				if(j==3)
					break outerLoop;
			}
			System.out.println();
		}
	}

}
