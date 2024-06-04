import java.util.Scanner;

// 1. 
// 2. 사용자에게 정수 n, m 입력 받아 n의 m 제곱수 출력
// 3. 사용자에게 입력 받은 정수의 약수 출력
// 4. 사용자에게 임의의 5개 정수를 입력 받아 최소값과 최대값 출력
// 5. 자판기 프로그램
//   - 음료수 하고 돈 넣어서 거스름돈 줄 때까지
// 6. 주사위 페어 프로그램
// 어제거에서 2명이서 10번 승부를 거쳐 각각 몇 번씩 이기고 지고 무승부까지 집계 출력
// 7 . 컴퓨터가 생각한 임의의 수(0~9)를 맞추기
public class Q1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 1;
		int sum = 0;
		int count = 0;
		while (i != 0) {
			System.out.print("반복 입력 : ");
			i = sc.nextInt();
			sum += i;
			count++;
		}
		double avg = (double) sum / (double) count;
		System.out.printf("총합은 %d입니다\n", sum);
		System.out.printf("평균은 %.2f입니다", avg);

	}

}
