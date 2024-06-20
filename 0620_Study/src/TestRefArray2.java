import java.util.Arrays;

class Student {
	private String name;
	private int age;
	private int score;

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}

public class TestRefArray2 {
	public static void main(String[] args) {

		// 길동학생 33세 100점
		// 둘리 22세 90점
		Student s1 = new Student("길동", 33, 100);
		Student s2 = new Student("둘리", 22, 90);
		
		Student[] arr = new Student[2];
		arr[0] = s1;
		arr[1] = s2;
		
		System.out.println(arr[0].getName());
		
	}
}
