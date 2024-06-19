
public class TestArrayLoop2 {

	public static void main(String[] args) {
		int[] nums = { 10, 20, 30, 40, 50 };

//		for(int i=0; i<nums.length; i++) {
//			nums[i] = -100;
//		}
		
		for(int i : nums)
			i = -100;
		
		for(int n : nums)
			System.out.println(n);
		
	}
}
