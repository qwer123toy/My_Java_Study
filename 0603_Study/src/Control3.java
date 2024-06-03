import java.util.Scanner;

public class Control3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int num = sc.nextInt();
		final int cutline = 70;

		if (num >= cutline) {
			System.out.println("합격");

		} else {
			System.out.println("불합격");
			System.out.println("부족한 점수 : " + (cutline - num));
		}

		System.out.println("종료!");

	}
}
