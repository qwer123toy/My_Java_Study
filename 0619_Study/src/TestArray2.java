
public class TestArray2 {
	public static void main(String[] args) {
		char[] arr = new char[] { 'H','e','l','l','o' };
		//String[] arr2 = new String[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] =='e')
				System.out.println(arr[i]);
		}
		
	}

}
