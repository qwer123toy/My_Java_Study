import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("★★★★★★★★★★★★★");
		System.out.println("★        스타벅스에       ★");
		System.out.println("★         오신 것을        ★");
		System.out.println("★        환영합니다       ★");
		System.out.println("★★★★★★★★★★★★★");
		System.out.println("메뉴를 선택해주세요!");
		System.out.println("1. 아메리카노  2. 카페라떼  3. 캬라멜 마끼야또");
		System.out.print("메뉴 입력 : ");
		int coffee = sc.nextInt();
		int price = 0;

		if (coffee < 1 || coffee > 3) {
			System.out.println("올바른 메뉴를 입력하세요");
		} else {
			System.out.println("사이즈를 선택해주세요!");
			System.out.println("1. Tall  2. Venti  3. Grande");
			System.out.print("사이즈 입력 : ");
			int size = sc.nextInt();

			if (size < 1 || size > 3)
				System.out.println("올바른 사이즈를 입력하세요");
			else {
				if (coffee == 1) {
					if (size == 1)
						price = 4000;
					else if (size == 2)
						price = 4500;
					else
						price = 5000;
				} else if (coffee == 2) {
					if (size == 1)
						price = 4500;
					else if (size == 2)
						price = 5000;
					else
						price = 5500;
				} else {
					if (size == 1)
						price = 5400;
					else if (size == 2)
						price = 5900;
					else
						price = 6400;
				}
			}

			if (price != 0) {
				System.out.printf("금액은 %d원입니다. 얼마를 내시겠어요?\n", price);
				System.out.print("금액 입력 : ");
				int money = sc.nextInt();
				int mod = money - price;

				if (mod < 0) {
					System.out.printf("비용이 부족합니다. %d원만큼 추가 금액이 필요해요", Math.abs(mod));
				} else {
					System.out.printf("거스름돈은 %d원입니다. 맛있게 드세요", mod);
				}
			}
		}
	}
}
