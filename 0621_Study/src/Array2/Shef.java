package Array2;

public class Shef {
	private String name;
	private int age;

	public Shef(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Shef [name=" + name + ", age=" + age + "]";
	}

}
