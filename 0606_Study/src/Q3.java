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

public class Q3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 설정 : ");

		String line = sc.nextLine();
		int count = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == '!' || line.charAt(i) == '@' 
					|| line.charAt(i) == '#' || line.charAt(i) == '$'
					|| line.charAt(i) == '%')
				count++;
		}
		if (count == 0)
			System.out.printf("특수문자를 추가해주세요.");
		else
			System.out.printf("비밀번호가 설정되었습니다.");
	}
}
