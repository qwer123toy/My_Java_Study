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
public class Q7 {
	public static void main(String[] args) {
		Random r = new Random();
		int ranNum = r.nextInt(10);
		Scanner sc = new Scanner(System.in);
		int checkNum = -1;
		System.out.println("랜덤 번호를 맞춰보세요!!");
		while (checkNum != ranNum) {
			System.out.print("숫자 입력 : ");
			checkNum = sc.nextInt();
			if (checkNum < 0 || checkNum >= 10)
				System.out.println("0~9까지 숫자만 입력하세요!");
			else {
				if (checkNum > ranNum)
					System.out.println("다운!!");
				else if (checkNum < ranNum)
					System.out.println("업!!");
				else
					System.out.printf("정답은 %d 였습니다!!", checkNum);
			}

		}

	}

}
