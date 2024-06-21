import java.util.Arrays;

public class TestArray2D3 {
	public static void main(String[] args) {

		int[][] arr = new int[3][];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		arr[0] = new int[] { 10, 20, 30 };
		arr[1] = new int[] { 40, 50, 60 };
		arr[2] = new int[] { 70, 80, 90 };

		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = arr[i].length - 1; j >= 0; j--)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}

//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
	}
}
