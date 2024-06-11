/*
 	객체지향
 
 */

// 학생 클래스 생성
class Student {

	int kor;
	int mat;
	int eng;

}

public class TestObject4 {
	public static void main(String[] args) {

		Student s = new Student();
		s.kor = 100;
		s.mat = 100;
		s.eng = 100;
		int sum = s.kor + s.mat + s.eng;
		System.out.println(sum);

	}
}
