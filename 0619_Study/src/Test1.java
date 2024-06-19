
public class Test1 {

	public int[] createZeroToNums(int lastNum) {
		int[] arr = new int[lastNum + 1];
		for (int i = 0; i <= lastNum; i++) {
			arr[i] = i;
		}
		return arr;
	}

	public static void main(String[] args) {
		Test1 test = new Test1();

		int[] arr = test.createZeroToNums(10);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		int[] arr2 = test.createZeroToNums(15);
		int[] arr3 = test.createZeroToNums(20);

	}
}
