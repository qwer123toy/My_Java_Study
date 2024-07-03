class Barista {
	Coffee c;

	Coffee getC() {
		return c;
	}

	void setC(Coffee c) {
		this.c = c;
	}

	public Coffee makeCoffee(String menu) {
		if (menu.equals("�Ƹ޸�ī��"))
			return new Americano(1);
		else if (menu.equals("ī���"))
			return new CaffeLatte(2, 50);
		return null;
	}

}

abstract class Coffee {
	protected int espresso;

	public Coffee(int espresso) {
		super();
		this.espresso = espresso;
	}

	int getEspresso() {
		return espresso;
	}

	void setEspresso(int espresso) {
		this.espresso = espresso;
	}

	public void shotCount() {
		System.out.println("���������� �� ���� : " + espresso);
	}
}

class Americano extends Coffee {

	public Americano(int espresso) {
		super(espresso);
		// TODO Auto-generated constructor stub
	}

}

class CaffeLatte extends Coffee {
	protected int milk;

	public CaffeLatte(int espresso, int milk) {
		super(espresso);
		this.milk = milk;
	}

	int getMilk() {
		return milk;
	}

	void setMilk(int milk) {
		this.milk = milk;
	}

}

public class TestBarista {
	public static void main(String[] args) {
		Barista b = new Barista();
		Americano a = (Americano) b.makeCoffee("�Ƹ޸�ī��");
		System.out.println(a.getClass());
		CaffeLatte c = (CaffeLatte) b.makeCoffee("ī���");
		System.out.println(c.getMilk());
	}
}
