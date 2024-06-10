import java.util.Scanner;

/* 
 	1. 사용자가 입력한 값이 1~9이면 one, two 처럼 입력, 아니면 other
	2. 369 게임 1~50
	3. 3x+10y=100을 만족하는 모든 해를 구하기 0<=x<=10, 0<=y<=10
	
	4. 가위바위보 게임
	
	5. 숫자 야구 게임
*/
public class Q3 {

	public static void main(String[] args) {
		// 1. 콜라(1500) 2. 사이다 1400

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				if (3 * i + 10 * j == 100)
					System.out.printf("해당하는 해는 %d과  %d입니다.", i, j);
			}
		}
	}
}
