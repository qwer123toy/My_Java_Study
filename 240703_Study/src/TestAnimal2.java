abstract class Birds extends Animal {
	public abstract void flySound();
}

class Sparrow extends Birds {

	@Override
	public void sound() {

		System.out.println("±±");
	}

	@Override
	public void flySound() {
		System.out.println("�Ĵ��Ĵ�");

	}

}

class Ducks extends Birds {

	@Override
	public void sound() {

		System.out.println("�в�");
	}

	@Override
	public void flySound() {
		System.out.println("�۴��۴�");

	}

}

class Chicken extends Birds{

	@Override
	public void flySound() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sound() {
		System.out.println("������");
		
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
		System.out.println("���� ���ڶ� ���� �ʽ��ϴ�.");
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
