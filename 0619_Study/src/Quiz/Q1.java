package Quiz;

import java.util.Scanner;

public class Q1 {
	Scanner sc = new Scanner(System.in);

	public void printHistogram() {
		int histo[] = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.print("정수 입력 : ");
			histo[i] = sc.nextInt();
			if (histo[i] < 0 || histo[i] > 100) {
				System.out.println("0~100까지만 입력하세요");
				i--;
			}
		}
		String[] star = new String[] { "", "", "", "", "", "", "", "", "", "", "" };

		for (int i : histo) {
			if (i <= 10) {
				star[0] += "*";
			} else if (i <= 20)
				star[1] += "*";
			else if (i <= 30)
				star[2] += "*";
			else if (i <= 40)
				star[3] += "*";
			else if (i <= 50)
				star[4] += "*";
			else if (i <= 60)
				star[5] += "*";
			else if (i <= 70)
				star[6] += "*";
			else if (i <= 80)
				star[7] += "*";
			else if (i <= 90)
				star[8] += "*";
			else if (i <= 100)
				star[9] += "*";
		}

		System.out.printf("%d ~ %d : %s\n", 0, 10, star[0]);
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d ~ %d : %s\n", (i * 10) + 1, (i * 10) + 10, star[i]);
		}
	}

	public static void main(String[] args) {
		Q1 q = new Q1();
		q.printHistogram();
	}
}
