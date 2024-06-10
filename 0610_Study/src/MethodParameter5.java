import java.util.Scanner;

//사용자에게 국영수 점수를 입력 받아 총점을 출력
public class MethodParameter5 {

	public static void printSum(int kor, int math, int eng) {
		System.out.println(kor+math+eng);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력");
		int kor = sc.nextInt();
		System.out.println("수학 점수 입력");
		int math = sc.nextInt();
		System.out.println("영어 점수 입력");
		int eng = sc.nextInt();
		System.out.println("총합은 " + (kor+math+eng));
		printSum(kor, math, eng);
		
	}
}
