import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

class Student implements Comparator<Student>, Comparable<Student> {
	private int score;
	private int height;
	private int weight;

	public Student(int score, int height, int weight) {
		super();
		this.score = score;
		this.height = height;
		this.weight = weight;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Student [score=" + score + ", height=" + height + ", weight=" + weight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + score;
		result = prime * result + weight;
		return result;
	}

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getWeight() - o2.getWeight();
	}

	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return this.getHeight() - arg0.getHeight();
	}

}

public class TestOrders2 {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		students.add(new Student(100, 180, 80));
		students.add(new Student(90, 190, 75));
		students.add(new Student(80, 170, 85));

		System.out.println(students);

		Collections.sort(students);
		System.out.println(students);

		Collections.sort(students, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return o1.getScore() - o2.getScore();
			}
		});
		
		System.out.println(students);

	}
}
