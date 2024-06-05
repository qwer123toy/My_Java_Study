import java.util.Random;
import java.util.Scanner;

//사용자에게 무작위 정수를 제시하고
//해당 수의 배수를 순서대로 입력해야하는 프로그램
//
/*
	예) 3의 배수를 입력하세요
	3
	6
	9
	11 오답시 종료*/
public class LoopControl3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Random r = new Random();
		int num = r.nextInt(8) + 2;
		int input = 0;
		int count = 0;
		System.out.printf("%d의 배수를 입력하세요\n", num);

		while (true) {
			input = sc.nextInt();
			if (input % num == 0) {
				//System.out.println(input);
				count++;
			} else {
				break;
			}

		}
		System.out.printf("종료 : %d개를 입력했습니다.", count);
	}
}
