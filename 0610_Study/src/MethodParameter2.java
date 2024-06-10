import java.util.Scanner;

public class MethodParameter2 {

	public static void printNum(int num)//0부터 전달받은 정수값까지 출력하는 메소드 작성 
	{
		for(int i=0; i<=num;i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		
		printNum(15);
		
		
	}
}
