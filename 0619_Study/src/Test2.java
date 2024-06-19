
public class Test2 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		int[] arr2 = { 40, 50, 60 };

		int[] extend = new int[5];
		for (int i = 0; i <arr.length; i++) {
			extend[i] = arr[i];
		}
		for (int i = 0; i <extend.length; i++) {
			System.out.println(extend[i]);
		}

	}
}
