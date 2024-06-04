import java.util.Scanner;

//사용자가 입력한 정수의 배수들을 10개 나열
// 예) 7 14 ... 70
// 100~20 사이의
public class Loop4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
//		int i = 1;
//		int j = 0;
//		int max = 0;
//		int result = 0;

		int i = 100;
		int j = 0;
		while (i <= 200 && j < 10) {
			if (i % num == 0) {
				System.out.printf("%d ", i);
				j++;
			}
			i++;
		}

//		while (max < 100) {
//			max = num * i;
//			i++;
//		}
//
//		result = max;
//
//		while (j < 10 && result < 200) {
//			System.out.printf("%d ", result);
//			j++;
//			result = max + num * j;
//		}

	}

}
