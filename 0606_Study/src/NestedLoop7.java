import java.util.Scanner;

// 2~100까지 소수 찾기

public class NestedLoop7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int finalCount = 0;
		for (int i = 0; i <= 100; i++) {

			int count = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}

			}
			if (count == 2) {
				System.out.println(i + "은 소수입니다.");
				finalCount++;
			}
		}
		System.out.printf("총 소수 개수는 %d개입니다.",finalCount);
	}

}
