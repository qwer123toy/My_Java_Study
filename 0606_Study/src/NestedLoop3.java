import java.util.Scanner;

// 사용자 정수 입력시 다음과 같이 출력
// 3 
// (1,1), (1,2),(1,3)
//(2,1), (2,2),(2,3)
//(3,1), (3,2),(3,3)

public class NestedLoop3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력?");
		int num = sc.nextInt();

		for (int j = 1; j <= num; j++) {

			if ((j % 2) == 0) {
				for (int k = num; k > 0; k--) {
					System.out.print(k);
				}
			} else {
				for (int i = 1; i <= num; i++)
					System.out.print(i);
			}
			System.out.println();
		}

	}
}
