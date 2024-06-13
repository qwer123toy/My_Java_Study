
public class Human {
	String name = "길동";
	int age = 22;

	public Human(String n, int a) {
		name = n;
		age = a;
	}

	public static void main(String[] args) {
		Human h1 = new Human("a", 22);
		Human h2 = new Human("b", 33);
		
		System.out.println(h1.name);
		System.out.println(h1.age);
		System.out.println(h2.name);
		System.out.println(h2.age);
	}
}
