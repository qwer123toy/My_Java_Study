
public class Student {

	String name;
	int kor;
	int mat;
	int eng;
	// 학생
	// 이름 국어 영어 수학

	public Student(String name, int kor, int m, int e) {
		this.name = name;
		this.kor = kor;
		this.mat = m;
		this.eng = e;

	}

	public Student(String name) {
		this.name = name;
	}
	
	public int getSum() {
		return kor+mat+eng;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}
	public int getMat() {
		return mat;
	}
	public int getEng() {
		return eng;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	

	public static void main(String[] args) {

		Student s = new Student("김순자");
		Student s2 = new Student("김명옥", 90, 80, 70);
		
		s.setName("김만덕");
		s.setKor(80);
		s.setMat(70);
		s.setEng(60);
		
		System.out.println(s.getName());
		System.out.println(s.getKor());
		System.out.println(s.getMat());
		System.out.println(s.getEng());
		System.out.println(s.getSum());

	}
}
