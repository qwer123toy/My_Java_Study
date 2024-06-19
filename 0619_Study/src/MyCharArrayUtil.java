
public class MyCharArrayUtil {

	public void printElems(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public int findPrintElems(char[] arr, char a) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a)
				return i;
		}

		return -1;
	}

	public boolean exist(char[] arr, char ch) {
		int index = findPrintElems(arr, ch);
		return index >= 0;
	}

}
