package Static;

class Circle {
	int radius;
	static final double pi = 3.14;

	public double getArea() {
		return radius * radius * pi;
	}
}

public class TestCircle {
	public static void main(String[] args) {
		System.out.println(Circle.pi);
	}
}
