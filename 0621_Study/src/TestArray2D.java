import java.util.Arrays;

public class TestArray2D {
	public static void main(String[] args) {

		int[] row = { 10, 20, 30 };
		int[] row2 = { 40, 50, 60 };
		int[] row3 = { 70, 80, 90 };

		int[][] a = { row, row2, row3 };

//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 3; j++) {
//				a[i][j] = j;
//			}
//		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
