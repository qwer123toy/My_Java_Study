import java.util.Arrays;

public class TestArray2D2 {
	public static void main(String[] args) {

		int[][] a = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = i * 30 + j * 10 + 10;
			}

		}
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
