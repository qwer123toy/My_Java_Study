import java.util.Scanner;

//7의 배수의 index 찾기
//원하는 만큼 정수를 입력 받아
//짝수,홀수 개수를 집계해서 출력
// 모든 입력을 나열

public class TestArrayLoop7 {
	
//	public int[] allIndexs(int[] arr, int num) {
//		
//	}
//	
	public int indexOfMultiple(int[] arr,int start, int num) {
		for (int i = start; i < arr.length; i++)
			if (arr[i] % num == 0) {
				return i;
			}
		return -1;
	}
	
	public int indexOfMultiple(int[] arr, int num) {
		return indexOfMultiple(arr, 0,num);
	}

	public boolean existsMultiple(int[] arr, int num) {
		return indexOfMultiple(arr, num) >= 0;

	}

	public static void main(String[] args) {
		int[] nums = { 20, 30, 40, 55, 66, 77 };
		TestArrayLoop7 test = new TestArrayLoop7();
		
		System.out.println(test.indexOfMultiple(nums, 7));
		System.out.println(test.existsMultiple(nums, 7));
		
		System.out.println(test.existsMultiple(nums, 5));
		
		

	}
}
