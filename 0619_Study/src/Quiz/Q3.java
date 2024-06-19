package Quiz;

public class Q3 {

	public int[] allIndexs(int[] arr, int num) {
		int length = 0;
		int[] indexArr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % num == 0) {
				indexArr[length] = i;
				length++;
			}
		}
		int[] resultArr = new int[length];
		for (int i = 0; i < resultArr.length; i++) {
			resultArr[i] = indexArr[i];
		}
		return resultArr;
	}

	public static void main(String[] args) {
		int[] nums = { 20, 30, 12, 55, 77 };
		Q3 test = new Q3();

		int[] resultArr = test.allIndexs(nums, 5);

		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}
}
