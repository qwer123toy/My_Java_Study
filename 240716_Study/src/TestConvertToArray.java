import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestConvertToArray {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("가", "나", "다"));
		String[] arrays = list.toArray(new String[0]);

//		String[] arrays = new String[list.size()];
//		
//		for(int i=0; i<arrays.length; i++) {
//			arrays[i] = list.get(i);
//		}
		
		System.out.println(Arrays.toString(arrays));
		
		int[] numbers = {10,20,30,40,50};
		
		List<Integer> listNumbers = new ArrayList<>();
		
		for(int n : numbers) {
			listNumbers.add(n);
		}
		System.out.println(listNumbers);
		
		Integer[] boxed = {50, 60, 70,80}; // 객체로 생성하였을 때
		List<Integer> listBoxed = new ArrayList<>(Arrays.asList(boxed)); // 원소를 같게 가지는 리스트를 쉽게 생성 가능
		System.out.println(listBoxed);
	}
}
