class Shape {

	public void printArea() {
		System.out.println("도형의 넓이는 나도 몰라!");
	}

}

class Triangle extends Shape {
	int height;
	int width;

	@Override
	public void printArea() {
		System.out.println("삼각형의 넓이는 " + ((double) height * width * 0.5));
	}

}

class Rectangle extends Shape {
	int height;
	int width;

	@Override
	public void printArea() {
		System.out.println("사각형의 넓이는 " + (height * width));
	}
}

class Circle extends Shape {
	private int radius;

	@Override
	public void printArea() {
		System.out.println("원의 넓이는 " + (double) radius * radius * 3.14);
	}
}

public class TestShape {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.height=10;
		t.width=20;
		
		Rectangle r = new Rectangle();
		r.height = 5;
		r.width = 10;
		t.printArea();
		r.printArea();
	}
}
