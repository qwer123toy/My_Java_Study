import java.util.Scanner;

public class ForLoop5 {
//정수의 시작과 끝을 입력하면 모든 정수를 나열 후 총합 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 범위 입력 : ");
		int first = sc.nextInt();
		int last = sc.nextInt();
		int sum = 0;
		
		for (int i = first; i <= last; i++) {
			System.out.println(i);
			sum += i;
			
		}
		System.out.println(sum);
	}

}
