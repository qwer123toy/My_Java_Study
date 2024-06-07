import java.util.Random;
import java.util.Scanner;

// 사용자 입력한 한줄에
// b가 몇개인 지 확인

public class TestString6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");

		String line = sc.nextLine();
		int count=0;
		
		for (int i = 0; i < line.length(); i++) {
			if(line.charAt(i)=='b')
				count++;
		}
		System.out.printf("b의 개수는 %d입니다.",count);
	}
}
