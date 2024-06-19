
public class Test5 {

	public static void main(String[] args) {
		int[] nums = { 33, 37, 32, 23, 77 };
		int[] reversed = new int[nums.length];
		
		for(int i=0,j=nums.length-1; i<nums.length; i++,j--) {
			reversed[j] = nums[i];
		}
		for(int i=0; i<reversed.length; i++) {
			System.out.println(reversed[i]);
		}
	}
}
