import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//정수 5번 입력받아 중복되지 않는 목록 출력

//중복 입력이 된 정수를 출력 하기
public class TestDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		List<Integer> listDup = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			System.out.println("정수 입력 : ");

			try {// 리스트는 중복을 허용하기 때문에 입력을 받을 때 미리 중복값을 확인하는 것이 좋음
				int userInput = sc.nextInt();

				if (!list.contains(userInput))
					list.add(userInput);
				else {
					listDup.add(userInput);
				}
			} catch (Exception e) {
				// TODO: handle exception

			}
		}

		System.out.println(list);
		System.out.println(listDup);

	}
}
