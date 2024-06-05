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
public class LoopControl4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0)
				continue;
			System.out.println(i);
		}
	}
}
