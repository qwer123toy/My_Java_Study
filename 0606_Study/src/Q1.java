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

public class Q1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("단어 입력 : ");

		String line = sc.nextLine();
		int count = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == 'a' || line.charAt(i) == 'e' 
					|| line.charAt(i) == 'i' || line.charAt(i) == 'o'
					|| line.charAt(i) == 'u')
				count++;
		}

		System.out.printf("%s의 모음 개수는 %d입니다.", line, count);
	}
}
