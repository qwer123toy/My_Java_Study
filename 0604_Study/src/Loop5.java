import java.util.Scanner;

//사용자가 입력한 정수의 배수들을 10개 나열
// 예) 7 14 ... 70
// 100~20 사이의
public class Loop5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);		

		int i = 1;
		int sum = 0;
		
		while (i != 0) {
			System.out.println("반복 입력 : ");
			i = sc.nextInt();
			sum += i;
		}
		System.out.println(sum);

	}

}
