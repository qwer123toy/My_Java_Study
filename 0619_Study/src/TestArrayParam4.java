
public class TestArrayParam4 {
	
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		TestArrayParam4 test = new TestArrayParam4();
		
		int[] a = { 10, 0, 0, 40 };
		test.swap(a, 0, 3);
		
		System.out.println(a[3]);

	}
}
