abstract class Animal {
	public abstract void sound();
}

class Puppy extends Animal {

	@Override
	public void sound() {

		System.out.println("멍멍");
	}

}

class Kitten extends Animal {

	@Override
	public void sound() {

		System.out.println("그렇다면 저 고양이는");
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
