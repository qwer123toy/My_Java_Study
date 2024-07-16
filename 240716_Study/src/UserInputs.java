import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		while (true) {
			System.out.println("정수 입력 : ");

			try {
				list.add(sc.nextInt());
			} catch (Exception e) {
				// TODO: handle exception
				break;
			}
		}

		for (int i = list.size() - 1; i >= 0; i--) {
			System.out.println(list.get(i));
		}
	}
}