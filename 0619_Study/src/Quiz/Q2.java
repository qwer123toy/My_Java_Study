package Quiz;

// 두 정수 배열이 길이가 같고 원소가 같음을 확인하기
public class Q2 {
	public void checkArrayEqual(int[] num1, int[] num2) {
		int check = 0;
		if (num1.length != num2.length) {
			System.out.println("배열의 길이가 다릅니다.");
		} else {
			for (int i = 0; i < num1.length; i++) {
				check = num1[i] == num2[i] ? 1 : -1;
			}
			if (check == 1) {
				System.out.println("길이와 원소가 같은 배열입니다.");
			} else {
				System.out.println("배열의 원소가 다릅니다.");
			}
		}

	}

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 4 };
		int[] num2 = { 1, 2, 3, 4 };
		int[] num3 = { 1, 2, 3 };
		int[] num4 = { 1, 2, 4, 3 };
		Q2 q = new Q2();
		q.checkArrayEqual(num1, num2);
		q.checkArrayEqual(num1, num3);
		q.checkArrayEqual(num2, num4);

	}
}
