package Array2;

import java.util.Arrays;
import java.util.Scanner;

public class TestSort3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영단어 입력");
		String alpha = sc.next();
		char[] charArray = alpha.toCharArray();
		System.out.println(charArray);
		Arrays.sort(charArray);
		System.out.println(charArray);
		
	}
}
