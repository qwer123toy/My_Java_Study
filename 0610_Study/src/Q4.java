import java.util.Random;
import java.util.Scanner;

/* 
 	1. 사용자가 입력한 값이 1~9이면 one, two 처럼 입력, 아니면 other
	2. 369 게임 1~50
	3. 3x+10y=100을 만족하는 모든 해를 구하기 0<=x<=10, 0<=y<=10
	
	4. 가위바위보 게임
	
	5. 숫자 야구 게임
*/
public class Q4 {

	public static void rsp(String user, String computer) {
		if (user.equals(computer)) {
			System.out.printf("%s vs %s로 무승부입니다.", user, computer);
		} else {
			if (user.equals("바위")) {// 유저가 바위
				if (computer == "보")
					System.out.printf("%s vs %s로 유저가 패배하였습니다.", user, computer);
				else
					System.out.printf("%s vs %s로 유저가 승리하였습니다.", user, computer);
			} else if (user.equals("가위")) {// 유저가 가위
				if (computer == "보")
					System.out.printf("%s vs %s로 유저가 승리하였습니다.", user, computer);
				else
					System.out.printf("%s vs %s로 유저가 패배하였습니다.", user, computer);
			} else {// 유저가 보
				if (computer == "바위")
					System.out.printf("%s vs %s로 유저가 승리하였습니다.", user, computer);
				else
					System.out.printf("%s vs %s로 유저가 패배하였습니다.", user, computer);
			}

		}
	}

	public static void rsp2(String user, String computer) {

		if (user.equals(computer)) {
			System.out.printf("%s vs %s로 무승부입니다.", user, computer);
		} else {
			if (user.equals("바위")) {// 유저가 바위
				if (computer == "보")
					System.out.printf("%s vs %s로 유저가 패배하였습니다.", user, computer);
				else
					System.out.printf("%s vs %s로 유저가 승리하였습니다.", user, computer);
			} else if (user.equals("가위")) {// 유저가 가위
				if (computer == "보")
					System.out.printf("%s vs %s로 유저가 승리하였습니다.", user, computer);
				else
					System.out.printf("%s vs %s로 유저가 패배하였습니다.", user, computer);
			} else {// 유저가 보
				if (computer == "바위")
					System.out.printf("%s vs %s로 유저가 승리하였습니다.", user, computer);
				else
					System.out.printf("%s vs %s로 유저가 패배하였습니다.", user, computer);
			}

		}
	}
	
	public static void main(String[] args) {
		// 1. 콜라(1500) 2. 사이다 1400

		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("어떤 것을 내시겠습니까?");
		System.out.println("가위, 바위, 보");

		Scanner sc = new Scanner(System.in);
		String choose = sc.next();
		if (choose.equals("가위") || choose.equals("바위") || choose.equals("보")) {
			Random r = new Random();
			int ran = r.nextInt(3) + 1;
			String vs = "가위";
			switch (ran) {
			case 1:
				vs = "가위";
				break;
			case 2:
				vs = "바위";
				break;
			case 3:
				vs = "보";
				break;
			}
			rsp(choose, vs);
			sc.close();
		} else {
			System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");

		}

	}
}
