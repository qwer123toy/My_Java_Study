import java.util.Arrays;

public class TestArrayUtil {
	public static void main(String[] args) {
		int[] fillTen = new int[5];
		Arrays.fill(fillTen, 10);
		System.out.println(Arrays.toString(fillTen));

		Arrays.fill(fillTen, 0, 3, 15);
		System.out.println(Arrays.toString(fillTen));
	}
}
