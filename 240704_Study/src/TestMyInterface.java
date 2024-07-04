
public class TestMyInterface {
	public static void main(String[] args) {
		// MyInterface my = new MyInterface() {};

		MyInterface my2 = new MyImple();
		my2.printHello();
		MyInterface your = new YourImple();
		your.printHello();
	}
}
