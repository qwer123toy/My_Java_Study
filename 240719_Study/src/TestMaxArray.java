
public class TestMaxArray {
	
	public static <T extends Comparable<T>> Integer countGreater(T[] arr, T target) {
		int count =0;
		for( T t : arr) {
			if(t.compareTo(target)>0) {
				count++;
			}
		}
		return count;
	}
	
	public static <T> void printAllElem(T[] arr) {
		for(T i : arr) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Integer[] arrInt = {10,20,30};
//		printAllElem(arrInt);
		System.out.println(countGreater(arrInt,10));
		
		Double[] arrDbl = {15.0, 25.0, 35.0};
		boolean[] aa = {true, false};
		printAllElem(arrDbl);
	//	printAllElem(aa);
	}
}
