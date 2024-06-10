import java.util.Scanner;

public class MethodParameter3 {

	public static int printNum(int num)// 0부터 전달받은 정수값까지 합을 출력하는 메소드 작성
	{
		int sum = 0;
		for (int i = 0; i <= num; i++)
			sum += i;
		return sum;
	}

	public static void main(String[] args) {

		
		System.out.println(printNum(10));

	}
}
