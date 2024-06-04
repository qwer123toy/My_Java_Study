import java.util.Scanner;

//정수 2개 입력 하면 범위 안의 정수를 출력 예) 20 30 -> 21 22 ... 29
public class Loop3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개 입력 : ");
		int left = sc.nextInt();
		int right = sc.nextInt();

		if(left<right) {
			left++;
			while (left < right) {
				System.out.println(left);
				left++;
			}	
		}
		else {
			right++;
			while (left > right) {
				System.out.println(right);
				right++;
			}
		}

		

//		if(right>left) {
//			System.out.printf("%d와 %d 사이의 정수 출력\n", left, right);
//			for (int i = left + 1; i < right; i++) {
//				System.out.printf("%d ", i);
//			}
//		}
//		else {
//			System.out.printf("%d와 %d 사이의 정수 출력\n", right, left);
//			for (int i = right + 1; i < left; i++) {
//				System.out.printf("%d ", i);
//			}
//		}

	}
}
