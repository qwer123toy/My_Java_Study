import java.util.Random;
import java.util.Scanner;

// 1.SUm2번
// 2. 사용자에게 정수 n, m 입력 받아 n의 m 제곱수 출력
// 3. 사용자에게 입력 받은 정수의 약수 출력
// 4. 사용자에게 임의의 5개 정수를 입력 받아 최소값과 최대값 출력
// 5. 자판기 프로그램
//   - 음료수 하고 돈 넣어서 거스름돈 줄 때까지
// 6. 주사위 페어 프로그램
// 어제거에서 2명이서 10번 승부를 거쳐 각각 몇 번씩 이기고 지고 무승부까지 집계 출력
// 7 . 컴퓨터가 생각한 임의의 수(0~9)를 맞추기
public class Q6 {
	public static void main(String[] args) {
		int countAwin = 0;
		int countBwin = 0;
		int draw = 0;
		int count = 0;
		while (count < 10) {
			Random r = new Random();
			int numA1 = r.nextInt(6) + 1;
			int numA2 = r.nextInt(6) + 1;
			int numB1 = r.nextInt(6) + 1;
			int numB2 = r.nextInt(6) + 1;

			System.out.printf("A 주사위 값 : %d %d \n", numA1, numA2);
			System.out.printf("B 주사위 값 : %d %d \n", numB1, numB2);

			if (numA1 == numA2 && numB1 == numB2) {
				int sumA = numA1 + numA2;
				int sumB = numB1 + numB2;

				if (sumA == sumB) {
					draw++;
					System.out.println("무승부");
				} else if (sumA > sumB) {
					System.out.println("A 승리");
					countAwin++;
				}

				else {
					System.out.println("B 승리");
					countBwin++;
				}

			} else if (numA1 == numA2) {
				System.out.println("A 승리");
				countAwin++;
			}

			else if (numB1 == numB2) {
				System.out.println("B 승리");
				countBwin++;
			} else {
				System.out.println("무승부");
				draw++;
			}

			count++;
		}
		System.out.printf("A가 이긴 횟수 : %d\n", countAwin);
		System.out.printf("B가 이긴 횟수 : %d\n", countBwin);
		System.out.printf("비긴 횟수 : %d\n", draw);
	}

}
