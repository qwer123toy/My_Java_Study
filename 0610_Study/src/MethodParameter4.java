import java.util.Scanner;

public class MethodParameter4 {

	public static void printPlus(int num, int num2) {
		System.out.println(num + num2);
	}

	public static void printMinus(int num, int num2) {
		System.out.println(num - num2);
	}

	public static void printMultiple(int num, int num2) {
		System.out.println(num * num2);
	}

	public static void printDivide(int num, int num2) {
		if (num2 != 0)
			System.out.println(num / num2);
	}

	public static void main(String[] args) {

		printPlus(10, 2);
		printMinus(5, 2);
		printMultiple(10, 12);
		printDivide(10, 3);

	}
}
