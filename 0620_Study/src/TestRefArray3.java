import java.util.Arrays;

public class TestRefArray3 {
	public static void main(String[] args) {

		Student[] arr = new Student[] { new Student("길동", 33, 100), new Student("둘리", 22, 90),
				new Student("도우너", 44, 80) };

		arr[0] = null;
		System.out.println(arr[1].getName());
	}
}
