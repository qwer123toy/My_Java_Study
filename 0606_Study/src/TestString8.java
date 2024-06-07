import java.util.Random;
import java.util.Scanner;

// Q1. 사용자가 입력한 영단어에 모음이 몇개 있는지 출력



public class TestString8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 문자열 입력 : ");

		String line = sc.nextLine();
		String line2 = sc.nextLine();
		if (line.length() == line2.length()) {

			for (int i = 0; i < line.length(); i++) {
				System.out.print(line.charAt(i)+", ");
				System.out.print(line2.charAt(i));
				System.out.println();
			}
		}else {
			System.out.println("두 문자열 길이가 다릅니다");
		}
		// System.out.printf("b의 개수는 %d입니다.",count);
	}
}
