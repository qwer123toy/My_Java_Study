
public class Test7 {

	public static void main(String[] args) {
		int[] left = { 10, 20, 30, 40 };
		int[] right = { 100, 200, 300, 400 };
		// 두개 배열의 모든 원소를 가지는 정수 배열 생성
		int[] concat = new int[left.length + right.length];

		int index = 0;

		for (int i = 0, j = 0; i < Math.max(left.length, right.length); i++, j++) {
			concat[i] = left[i];
			concat[left.length + j] = right[j];

		}
//		
//		for (int num : left) {
//			concat[index] = num;
//			index++;
//		}
//
//		for (int num : right) {
//			concat[index] = num;
//			index++;
//		}
//		
//		for (int i = 0; i < concat.length; i++) {
//			if (i < left.length)
//				concat[i] = left[i];
//			else
//				concat[i] = right[i - left.length];
//		}

		for (int i = 0; i < concat.length; i++) {
			System.out.println(concat[i]);
		}
	}
}
