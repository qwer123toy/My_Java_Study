
public class TestArrayLoop3 {

	public static void main(String[] args) {
		int[] nums = { 13, 21, 30, 41, 50 };

		//배열의 요소 값들을 변경할 때는 for-each문 사용 X
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0)
				nums[i] = 0;
		}
		
		for (int n : nums)
			System.out.println(n);

	}
}
