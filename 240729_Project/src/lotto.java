import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class lotto {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lottoNum = new LinkedHashSet<>();
		
		Scanner sc = new Scanner(System.in);
		LinkedHashSet<Integer> chooseNum = new LinkedHashSet<>();
		
		while (lottoNum.size() != 6) {
			int num = (int) (Math.random() * 44 + 1);
			lottoNum.add(num);
		}

		System.out.println(lottoNum);

		while (chooseNum.size() != 6) {
			System.out.print("번호 입력 : ");
			try {
				int num = sc.nextInt();
				chooseNum.add(num);
			} catch (Exception e) {
				System.out.println("숫자만 입력하세요.");
			}
		
		}
		ArrayList<Integer> compareLottoNum = new ArrayList<>();
		ArrayList<Integer> compareChooseNum = new ArrayList<>();
		for(int n : lottoNum) {
			compareLottoNum.add(n);
		}
		for(int n : chooseNum) {
			compareChooseNum.add(n);
		}
		
		Collections.sort(compareLottoNum);
		Collections.sort(compareChooseNum);

		for(int n: compareLottoNum)
		compareLottoNum.set(0, 100);
		System.out.println(lottoNum);
//		System.out.println(chooseNum);
		
		
		

	}
}
