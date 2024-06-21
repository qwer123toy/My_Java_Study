package Array2;

import java.util.Arrays;

class Animal {
	String name;
	int age;
	String ownerName;

	public Animal(String name, int age, String ownerName) {
		super();
		this.name = name;
		this.age = age;
		this.ownerName = ownerName;
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

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", ownerName=" + ownerName + "]";
	}

}

public class TestAnimals {
	public static void main(String[] args) {
		Animal[] animals = new Animal[] { new Animal("푸들", 3, "길동"), new Animal("세퍼드", 5, "마이콜") };
		System.out.println(animals[0].toString());
	}
}
