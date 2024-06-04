import java.util.Scanner;

// 1.SUm2번
// 2. 사용자에게 정수 n, m 입력 받아 n의 m 제곱수 출력
// 3. 사용자에게 입력 받은 정수의 약수 출력
// 4. 사용자에게 임의의 5개 정수를 입력 받아 최소값과 최대값 출력
// 5. 자판기 프로그램
// 6. 주사위 페어 프로그램
public class Q2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 두개 입력 : ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 1;
		
		while (m > 0) {
			result *= n;
			m--;
		}
		System.out.println(result);

	}

}
