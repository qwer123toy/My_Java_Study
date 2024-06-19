
public class TestArrayLoop5 {

	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50 };

		for (int n : nums) {
			int ten = n / 10;
			if (ten % 2 == 1)
				System.out.println(n);
		}

	}
}
