import java.util.Scanner;

public class TernaryOperator2 {
	public static void main(String[] args) {
		// 삼항 연산자
		//

		Scanner sc = new Scanner(System.in);

		int num = 4;
		System.out.println(num > 0 ? "양수" : "음수");
		
		if(num>0)
			System.out.println("양수");
		else if(num<0)
			System.out.println("음수");
		else
			System.out.println("0");

	}
}
