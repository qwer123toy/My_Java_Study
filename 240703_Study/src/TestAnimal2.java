abstract class Birds extends Animal {
	public abstract void flySound();
}

class Sparrow extends Birds {

	@Override
	public void sound() {

		System.out.println("Â±Â±");
	}

	@Override
	public void flySound() {
		System.out.println("ÆÄ´ÚÆÄ´Ú");

	}

}

class Ducks extends Birds {

	@Override
	public void sound() {

		System.out.println("²Ð²Ð");
	}

	@Override
	public void flySound() {
		System.out.println("ÆÛ´öÆÛ´ö");

	}

}

class Chicken extends Birds{

	@Override
	public void flySound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		System.out.println("²¿³¢¿À");
		
	}
	
}

class Penguin extends Birds{

	@Override
	public void flySound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Àú´Â »ó³²ÀÚ¶ó ¿ïÁö ¾Ê½À´Ï´Ù.");
	}
	
}

public class TestAnimal2 {
	public static void main(String[] args) {
		Birds b1 = new Sparrow();
		Birds b2 = new Ducks();

		b1.sound();
		b1.flySound();
		b2.sound();
		b2.flySound();
	}
}
