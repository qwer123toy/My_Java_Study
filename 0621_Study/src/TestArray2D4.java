import java.util.Arrays;

public class TestArray2D4 {
	public static void main(String[] args) {

		int[][] arr = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int[][][] arr2 = {{ { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } },{ { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } },{ { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } }};
		
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(Arrays.toString(arr[i]));
		}

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.deepToString(arr));
		System.out.println(Arrays.deepToString(arr2));
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for(int[]a : arr) {
			for(int elem : a) {
				System.out.print(elem + " ");
			}
			System.out.println();
		}
	}
}
