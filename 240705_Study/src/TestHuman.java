class Human {
	String name;

	public Human(String name) {
		this.name = name;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

}

public class TestHuman {
	public static void print(Human human) {
		String result = human.getName();
		System.out.println(result);
	}

	public static void main(String[] args) {
		print(new Human("³¢¾æÈ£¿ì"));
	}
}
