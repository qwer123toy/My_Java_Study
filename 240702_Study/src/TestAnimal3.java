
public class TestAnimal3 {
	public static void main(String[] args) {

		Animal c = new Cat("≥≥", 3);
		Animal d = new Dog("πŸµœ¿Ã", 4);
		Animal l = new Lion("ªÔπŸ", 5, 250);

		Animal[] array = { c, d, l };

		for (Animal a : array) {
			System.out.println(a.getName());

			// Dog∑Œ DownCasting «œø© bark »£√‚
			if (a instanceof Dog) {
				Dog down = (Dog) a;
				down.bark();
			}
		}
	}
}
