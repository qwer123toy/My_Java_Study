import java.util.Scanner;

/*
	2. 피즈버즈 출력하기(1~101)
	3의배수는 Fizz, 5의 배수는 Buzz, 3의 배수이면서 5의 배수인 경우는 Fizz Buzz
	예) 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz ...

*/
public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= 15; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				System.out.print(" Fizz Buzz ");
			else if (i % 3 == 0)
				System.out.print(" Fizz ");
			else if (i % 5 == 0)
				System.out.print(" Buzz ");
			else
				System.out.print(" " + i + " ");
		}
	}
}
