import java.util.Random;
import java.util.Scanner;

// 별 그리기

public class TestString4 {
	public static void main(String[] args) {

		String str = "abcdef";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));

		for (int i = str.length()-1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}
}
