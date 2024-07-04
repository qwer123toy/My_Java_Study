import java.util.Arrays;

public class TestStudent {
	public static void main(String[] args) {
		Student[] arr = {new Student(180,80,100), new Student(170,70,90),new Student(190,75,95)};
		//CompareTo�� �������̵� �������ν� Array.sort�� ��ü������ ��밡��
//		System.out.println(arr[0].compareTo(arr[1]));
//		System.out.println(arr[0].compareTo(arr[2]));
		Arrays.sort(arr);
		
		for(Student s : arr) {
			System.out.println(s);
		}
		System.out.println();
		Arrays.sort(arr, new Ruler());
		
		for(Student s : arr) {
			System.out.println(s);
		}
		
		System.out.println();
		Arrays.sort(arr, new ScoreComparator());
		
		for(Student s : arr) {
			System.out.println(s);
		}
	}
}
