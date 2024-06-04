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
public class Q5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choose = 0; // 메뉴 선택 시 사용하는 변수
		//int extra = 0; // 해당 메뉴를 뺀 거스름돈을 계산
		int menuPrice = 0; // 메뉴가격
		int finalExtra = 0; // 최종 거스름돈
		boolean end = true; // 루프 탈출 변수

		System.out.println("★자판기★");
		while (end) {

			boolean coke = false; // 선택한 메뉴가 뭔지 판단하기 위한 변수
			boolean sprite = false;

			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 콜라 2. 사이다 3. 환타");
			System.out.print("메뉴 입력 : ");
			choose = sc.nextInt();

			if (choose < 1 || choose > 3) // 1~3을 벗어날 시
				System.out.println("올바른 메뉴를 선택하세요");
			else {
				if (choose == 1) { // 콜라 선택
					System.out.println("콜라의 가격은 1000원입니다.");
					menuPrice = 1000;
					coke = true;
				}

				else if (choose == 2) { // 사이다 선택
					System.out.println("사이다의 가격은 900원입니다.");
					menuPrice = 900;
					sprite = true;
				}

				else { // 환타 선택
					System.out.println("환타의 가격은 1100원입니다.");
					menuPrice = 1100;
				}


				System.out.printf("얼마를 지불하시겠어요?(현재 잔액 : %d원)\n",finalExtra);
				System.out.print("금액 입력 : ");
				int money = sc.nextInt();

				while ((finalExtra + money) < menuPrice) { // 모자란 금액을 확인하여 추가 금액을 요청
					if ((finalExtra + money) < menuPrice) {
						System.out.printf("%d원만큼 모자랍니다. 돈을 더 넣어주세요\n", menuPrice - (finalExtra + money));
						System.out.print("금액 입력 : ");
						money += sc.nextInt();
					}
				}

				//extra = money - menuPrice; // 받은 금액에서 메뉴 금액만큼 차감
				finalExtra += money - menuPrice; // 남은 거스름돈과 합쳐줌

				if (coke)
					System.out.printf("콜라를 드리겠습니다. 현재 남은 금액 : %d \n", finalExtra);
				else if (sprite)
					System.out.printf("사이다를 드리겠습니다. 현재 남은 금액 : %d \n", finalExtra);
				else
					System.out.printf("환타를 드리겠습니다. 현재 남은 금액 : %d \n", finalExtra);

				System.out.printf("추가로 주문을 하시겠어요?(Yes : 1, No : 2)\n");
				int checkEnd = sc.nextInt();

				if (checkEnd < 1 || checkEnd > 2) { // 반복문 탈출 조건문
					System.out.printf("올바른 입력이 아니므로 거래를 종료합니다. 거스름돈 %d원을 받으세요\n", finalExtra);
					end = false;
				} else if (checkEnd == 2) {
					System.out.printf("거스름돈 %d원을 드리겠습니다.\n", finalExtra);
					System.out.printf("안녕히 가세요.\n");
					end = false;
				}

			}
		}

	}

}
