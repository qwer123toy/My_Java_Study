import java.util.Scanner;

// 1.SUm2번
// 2. 사용자에게 정수 n, m 입력 받아 n의 m 제곱수 출력
// 3. 사용자에게 입력 받은 정수의 약수 출력
// 4. 사용자에게 임의의 5개 정수를 입력 받아 최소값과 최대값 출력 3 7 2 1 4
// 5. 자판기 프로그램
//   - 음료수 하고 돈 넣어서 거스름돈 줄 때까지
// 6. 주사위 페어 프로그램
// 어제거에서 2명이서 10번 승부를 거쳐 각각 몇 번씩 이기고 지고 무승부까지 집계 출력
// 7 . 컴퓨터가 생각한 임의의 수(0~9)를 맞추기
public class Q4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 0;
		int count = 1;
		int max = 0;
		int min = 0;

		while (count < 6) {
			System.out.printf("숫자 반복 입력(%d/5회) : ", count);
			i = sc.nextInt();

			if (count == 1) {
				max = i;
				min = i;
			}

			if (i < min)
				min = i;
			else if (i > max)
				max = i;
			count++;
		}
		System.out.println("최댓값은 " + max);
		System.out.println("최솟값은 " + min);

	}

}
