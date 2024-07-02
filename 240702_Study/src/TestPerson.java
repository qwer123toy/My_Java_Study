class Human {
	private String name;
	private int age;
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
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
	

}

class Student extends Human {

	private int kor;
	private int eng;
	private int mat;

	public Student(String name, int age, int kor, int eng, int mat) {
		super(name, age);
		//this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getSum() {
		return kor + mat + eng;
	}

}

class Customer extends Human {
	private String phoneNumber;

	public Customer(String name, int age, String phoneNumber) {
		super(name, age);
		this.phoneNumber = phoneNumber;
	}

	public Customer(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}

public class TestPerson {
	public static void main(String[] args) {
		Student s = new Student("±è´ö¹è", 23, 90, 80, 70);
		Customer c = new Customer("ºô¸® ÇÃ¸°", 33, "±â¾ï ¾È³ª");
		System.out.println(s.getSum());
		System.out.println(s.getName());
		System.out.println(c.getPhoneNumber());
	}
}
