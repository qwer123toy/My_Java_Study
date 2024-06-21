package Array2;

import java.util.Arrays;

class Pizza {
	private String name;
	private int price;
	private Shef shef;

	public Pizza(String name, int price, Shef shef) {
		super();
		this.name = name;
		this.price = price;
		this.shef = shef;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Shef getShef() {
		return shef;
	}

	public void setShef(Shef shef) {
		this.shef = shef;
	}

	@Override
	public String toString() {
		return "Pizza [name=" + name + ", price=" + price + ", shef=" + shef + "]";
	}

}

public class TestPizza {
	public static void main(String[] args) {

		Shef s = new Shef("김덕배", 33);
		Pizza peperoni = new Pizza("페퍼로니", 19000, s);
		System.out.println(peperoni.toString());
		System.out.println(peperoni);

		System.out.println("문자열 합연산 " + peperoni);
		Pizza[] pizzas = new Pizza[3];
		pizzas[0] = peperoni;
		pizzas[1] = new Pizza("치즈", 15000, new Shef("길동",32));
		pizzas[2] = new Pizza("불고기", 18000, new Shef("도우너",23));
		System.out.println(Arrays.toString(pizzas));
	}
}
