
public class TestArrayLoop {

	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50 };

		// for-each
		// 배열의 처음부터 끝까지 하나씩 가져와서 n에다가 넣어줌
		// 역순은 불가능
		int sum =0;
		for(int n : nums)  
			System.out.println(n);
	}
}
