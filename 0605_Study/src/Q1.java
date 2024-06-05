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

public class Q1 {

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
