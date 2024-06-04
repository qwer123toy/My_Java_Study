import java.util.Scanner;

//
// 10부터 100까지 홀수 합을 출력
// 
public class Counting3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int i = 1;

		while (i < 100) {
			if (i > 10 && i % 2 == 1)
				sum += i;
			i++;
		}
		System.out.println(sum);

	}

}
