import java.util.Arrays;

public class TestArrayUtil3 {
	public static void main(String[] args) {

		int[] origin = { 1, 2, 3 };

		int[] copy = Arrays.copyOf(origin, 10); // 동일한 유형의 새로운 배열 생성
		System.out.println(origin);
		System.out.println(Arrays.toString(copy));
		System.out.println(Arrays.equals(origin, copy));
		
		int[] shorten = Arrays.copyOf(origin, 1);
		System.out.println(Arrays.toString(shorten));
	}
}
