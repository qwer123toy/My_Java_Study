import java.util.Random;
import java.util.Scanner;

/* 
 	1. 사용자가 입력한 값이 1~9이면 one, two 처럼 입력, 아니면 other
	2. 369 게임 1~50
	3. 3x+10y=100을 만족하는 모든 해를 구하기 0<=x<=10, 0<=y<=10
	
	4. 가위바위보 게임
	
	5. 숫자 야구 게임
*/
public class Q5 {

	public static void main(String[] args) {
		System.out.println("숫자야구게임을 시작합니다.");
		Random r = new Random();
		int ran = r.nextInt(900) + 100;
//		int ran = 464;
		int count = 1;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("숫자 3자리를 입력하세요");
			System.out.print("숫자 입력 : ");

			int number = sc.nextInt();
			int strike = 0;
			int ball = 0;

			int hundred = number / 100;
			int ten = (number % 100) / 10;
			int one = number % 10;

			int ran_hundred = ran / 100;
			int ran_ten = (ran % 100) / 10;
			int ran_one = ran % 10;

			if (hundred == ran_hundred)
				strike++;
			if (ten == ran_ten)
				strike++;
			if (one == ran_one)
				strike++;

			if (hundred != ran_hundred && (hundred == ran_ten || hundred == ran_one)) {
				ball++;
			}
			if (ten != ran_ten && (ten == ran_hundred || ten == ran_one)) {
				ball++;
			}
			if (one != ran_one && (one == ran_hundred || one == ran_ten)) {
				ball++;
			}
			
			if (strike == 3) {
				System.out.println("정답을 입력했습니다!!");
				System.out.printf("총 %d회만에 성공했습니다.", count);
				break;
			} else {
				System.out.printf("%d 스트라이크 %d 볼\n", strike, ball);
				count++;

			}
		}

	}
}
