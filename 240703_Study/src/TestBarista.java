class Barista {
	Coffee c;

	Coffee getC() {
		return c;
	}

	void setC(Coffee c) {
		this.c = c;
	}

	public Coffee makeCoffee(String menu) {
		if (menu.equals("아메리카노"))
			return new Americano(1);
		else if (menu.equals("카페라떼"))
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
		System.out.println("에스프레소 샷 개수 : " + espresso);
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
		Americano a = (Americano) b.makeCoffee("아메리카노");
		System.out.println(a.getClass());
		CaffeLatte c = (CaffeLatte) b.makeCoffee("카페라떼");
		System.out.println(c.getMilk());
	}
}
