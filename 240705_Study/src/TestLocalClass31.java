import java.util.Scanner;

public class TestLocalClass31 {
	public static void main(String[] args) {
		class MyInput{
			private Scanner sc = new Scanner(System.in);
			public int input() {
				System.out.println("정수 입력");
				return sc.nextInt();
			}
		}
		
		MyInput m = new MyInput();
		int result = m.input();
		System.out.println(result);
	
	}
	
}
