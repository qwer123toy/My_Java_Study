import java.util.Scanner;

/* 
 	1. 사용자가 입력한 값이 1~9이면 one, two 처럼 입력, 아니면 other
	2. 369 게임 1~50
	3. 3x+10y=100을 만족하는 모든 해를 구하기 0<=x<=10, 0<=y<=10
	
	4. 가위바위보 게임
	
	5. 숫자 야구 게임
*/
public class Q2 {

	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				System.out.print("짝 ");
			}
			if (i / 10 == 3) {
				System.out.print("짝 ");
			}
			 else {
				System.out.print(i+" ");
			}
		}
	}
}
