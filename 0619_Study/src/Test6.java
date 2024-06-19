
class Student {
	String name;
	int[] score;

	public Student(String name, int[] score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getScore() {
		return score;
	}

	public void setScore(int[] score) {
		this.score = score;
	}

	public int getSum() {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}

}

/*
 * 학생 1 이름 : 길동 점수 : 100, 90, 80
 * 
 * 학생2 이름 : 둘리 점수 : 30, 20, 10
 * 
 * 학생3 이름 : 도우너
 * 
 * 점수 : 60, 50
 * 
 */
public class Test6 {

	public static void main(String[] args) {
		Student s1 = new Student("길동", new int[] { 100, 90, 80 });
		Student s2 = new Student("둘리", new int[] { 30, 20, 10 });
		Student s3 = new Student("도우너", new int[] { 60, 50 });

		for (int i = 0; i < s1.getScore().length; i++) {
			System.out.println(s1.getScore()[i]);
		}
		System.out.println("길동의 총점은 " + s1.getSum());
		
		for (int i = 0; i < s2.getScore().length; i++) {
			System.out.println(s2.getScore()[i]);
		}
		
		for (int i = 0; i < s3.getScore().length; i++) {
			System.out.println(s3.getScore()[i]);
		}
	}
}
