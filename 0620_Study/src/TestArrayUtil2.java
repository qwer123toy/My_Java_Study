import java.util.Arrays;

public class TestArrayUtil2 {
	public static void main(String[] args) {

		int[] origin = { 1, 2, 3, 4, 5 };
		int[] anotherRef = origin;

		int[] copy = Arrays.copyOf(origin, origin.length); // 동일한 유형의 새로운 배열 생성
		System.out.println(origin);
		System.out.println(anotherRef);
		System.out.println(copy);
		System.out.println(Arrays.equals(origin, anotherRef));
		System.out.println(Arrays.equals(origin, copy));
	}
}
