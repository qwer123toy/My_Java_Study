import java.util.Scanner;

// 과목 개수 입력 받고
// 점수 개수를 입력 받아 
// 총점을 구하는 프로그램
// 예) 과목수? 4
// 100 90 80 70
// 총합 : 340

public class NestedLoop4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("과목 개수  입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int j = 1; j <= num; j++) {
			System.out.print("점수 입력 : ");
			sum += sc.nextInt();
		}
		System.out.println("총합 : " + sum);
	}

}
