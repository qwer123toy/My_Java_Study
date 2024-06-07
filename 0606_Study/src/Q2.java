import java.util.Random;
import java.util.Scanner;
/*
 	Q1. 사용자가 입력한 영단어에 모음이 몇개 있는지 출력
 	모음 a, e, i, o, u
  	Q2. 사용자가 입력한 길이가 같은 2개의 문자열, 각 문자가 다른 개수를 출력하는 프로그램
 		ex) hello
 			hallo
 			1개의 문자가 다릅니다.
 	Q3. 사용자가 사용할 비밀번호를 입력했을 때,
 		특수문자 !@#$%가 없을 경우 안내메시지를 출력
 */

public class Q2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 문자열 입력 : ");

		String line = sc.nextLine();
		String line2 = sc.nextLine();
		int count = 0;
		if (line.length() == line2.length()) {

			for (int i = 0; i < line.length(); i++) {
				if(line.charAt(i)!=line2.charAt(i))
					count++;
			}
			System.out.println(count + "개의 문자가 다릅니다.");
		}else {
			System.out.println("두 문자열 길이가 다릅니다");
		}
	}
}
