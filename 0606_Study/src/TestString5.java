import java.util.Random;
import java.util.Scanner;

// 별 그리기

public class TestString5 {
	public static void main(String[] args) {

		String str = "abcdef";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");

		String line = sc.nextLine();

		for (int i = 0; i < line.length(); i += 2) {
			// System.out.println(str.charAt(i));
			System.out.println(line.charAt(i));
		}
	}
}
