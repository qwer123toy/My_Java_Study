import java.util.Scanner;

//사용자에게 몇개의 정수 입력할지 물어본 후
//원하는 만큼 정수를 입력 받아
//짝수,홀수 개수를 집계해서 출력
// 모든 입력을 나열
public class TestArrayLoop6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("몇개 입력하실?");
		int length = sc.nextInt();
		int countEven = 0;
		int[] arr = new int[length];

		for (int i = 0; i < length; i++) {
			System.out.print("정수 입력 : ");
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0)
				countEven++;
		}
		for (int n : arr) {
			System.out.println("입력받은 정수 : " + n);
		}
		System.out.println("짝수 개수 : " + countEven);
		System.out.println("홀수 개수 : " + (length - countEven));
	}
}
