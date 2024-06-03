import java.util.Scanner;

// bmi
// 정수 3개 입력 받아 가장 큰수 출력
// 스벅 가격 계산기
// 메뉴 아메 카라 마키야또
// 사이즈 톨 그란데 벤티
// 아메리카노 그란데 5000원 카페라떼 5500원 그란데 6400원(사이즈 별로 -500원)
public class Q1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("키 입력(cm) : ");
		double height = sc.nextDouble() * 0.01;
		System.out.print("몸무게 입력(kg) : ");
		double weight = sc.nextDouble();
		double bmi = weight / (height * height);
		System.out.println(bmi);
		if (bmi >= 30) {
			System.out.println("비만");
		} else if (bmi >= 25) {
			System.out.println("과체중");
		} else if (bmi >= 18.5) {
			System.out.println("정상");
		} else {
			System.out.printf("저체중");
		}

	}
}
