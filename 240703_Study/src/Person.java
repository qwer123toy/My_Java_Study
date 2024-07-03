
public class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
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
	public boolean equals(Object obj) {
		if(obj ==null)
			return false;
		if(!(obj instanceof Person))
			return false;
		Person comp = (Person) obj;
		
		return this.name.equals(comp.name) && this.age == comp.age;
	}
	
}
