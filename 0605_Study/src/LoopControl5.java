import java.util.Random;
import java.util.Scanner;

/*
	사용자에게 정수를 입력받아
	2자리 정수일 때 역순으로 출력
	예) 1
	2자리 정수를 입력하세요
	33
	자리값이 다른 정수를 입력하세요
	73
	뒤집은 수는 37입니다
	-1
	
	총 입력은 4회이고 올바른 입력은 1회입니다.

	음수 입력시 종료*/
/*
	2. 피즈버즈 출력하기(1~101)
	3의배수는 Fizz, 5의 배수는 Buzz, 3의 배수이면서 5의 배수인 경우는 Fizz Buzz
	예) 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 Fizz Buzz ...

	3. 사용자에게 정수를 입력받아 팩토리얼 구하기
	4. 피보나치수 나열하기(30개)
		1 1 2 3 5 8 13 ..
	5. 사용자에게 정수를 입력받아, 소수 여부를 확인 가능한 프로그램
	6. 특정 사용자만 사용할 수 있도록, 비밀번호를 확인하는 프로그램(제한된 기회를 제공)
*/
public class LoopControl5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int allCount = 0;
		int rightCount = 0;
		
		while (true) {
			System.out.print("정수를 입력(10~99) : ");
			int num = sc.nextInt();
			if (num < 0)
				break;
			else if (num < 10 || num >= 100) {
				System.out.println("2자리 정수를 입력하세요");
				allCount++;
			} else if (num % 10 == num / 10) {
				System.out.println("자리값이 다른 정수를 입력하세요");
				allCount++;
			} else {
				System.out.printf("뒤집은 수는 %d%d입니다\n", num / 10, num % 10);
				rightCount++;
				allCount++;
			}
		}
		System.out.printf("총 입력은 %d회이고, 올바른 입력은 %d회입니다.", allCount, rightCount);
	}
}
