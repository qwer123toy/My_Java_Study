abstract class Animal {
	public abstract void sound();
}

class Puppy extends Animal {

	@Override
	public void sound() {

		System.out.println("�۸�");
	}

}

class Kitten extends Animal {

	@Override
	public void sound() {

		System.out.println("�׷��ٸ� �� ����̴�");
	}

}

public class TestAnimal {
	public static void main(String[] args) {
		Animal p = new Puppy();
		Animal k = new Kitten();

		p.sound();
		k.sound();
	}
}
