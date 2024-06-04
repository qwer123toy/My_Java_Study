import java.util.Scanner;

//
//
//비회원은 최종 요금에 1.1배

public class ParkingPrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int FEE = 1000;
		int min;
		int totalPrice;
		double extra = 1.0;
		System.out.println("주차 시간 입력(분)");
		min = sc.nextInt();
		System.out.println("회원(1) 비회원(2)");
		int user = sc.nextInt();
		if(user>=1 && user<=2) {
			if (user == 2)
				extra = 1.1;
			
			totalPrice = (min / 10) * FEE;
			
			System.out.println(totalPrice* extra);
		}
		else
			System.out.println("ERROR");

	}
}
