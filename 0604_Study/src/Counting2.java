import java.util.Scanner;

//사용자에게 정수 5번 입력 받아
// 2자리 수이고(10~99) 일의자리가 3 6 9인 정수의 개수 구하기
// 
public class Counting2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = 0;
		int count = 0;

		while (i < 5) {
			System.out.print("정수 입력 : ");
			int num = sc.nextInt();
			if (num >= 10 && num <= 99) {
				num = num % 10;
				if (num == 3 || num == 6 || num == 9)
					count++;
			}
			i++;
		}
		System.out.println(count + "개");
	}

}
