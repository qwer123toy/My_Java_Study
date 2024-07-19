
public class TestCoffeeBuilder {
	public static void main(String[] args) {
		Coffee build = new Coffee.CoffeeBuilder().shot(3).milk(0).sugar(2).build();
	}
}
