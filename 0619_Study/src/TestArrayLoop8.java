public class TestArrayLoop8 {
//	public int[] allIndexs(int[] array, int targetNum) {
//		
//	}
	
	public int indexOfMultiple(int[] array, int start, int targetNum) {
		for (int i = start; i < array.length; i++) {
			if (array[i] % targetNum == 0) {
				return i;
			}
		}
		return -1;
	}
	
	public int indexOfMultiple(int[] array, int targetNum) {
		return indexOfMultiple(array, 0, targetNum);
	}
	
	public boolean existsMultiple(int[] array, int targetNum) {
		return indexOfMultiple(array, targetNum) >= 0;
	}
	
	public static void main(String[] args) {
		int[] nums = { 20, 30, 22, 33, 40, 55, 66, 77 };
		TestArrayLoop8 t = new TestArrayLoop8();
		
		// 7의 배수의 index 찾기
//		int findIndex = t.indexOfMultiple(nums, 7);
//		System.out.println(findIndex);
		// 7의 배수의 유무 확인하기
//		System.out.println(t.existsMultiple(nums, 7));
		
		// 5의 배수 유무 확인
		System.out.println(t.existsMultiple(nums, 5));
		// 5의 배수 index 찾기
		
		int index = 0;
		while (true) {
			index = t.indexOfMultiple(nums, index, 5);
			if (index < 0) {
				break;
			}
			System.out.println(index);
			index++;
		}
		
		
		// 1. 여러 인덱스 값을 원소로 가지는 배열을 반환하는 메소드
		
		// 2. 시작 인덱스 값을 추가의 파라미터로 전달받는 메소드
	}
}


