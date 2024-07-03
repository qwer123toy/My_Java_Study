abstract class Shape {// 추상 클래스

	public abstract void printArea(); // 츄상 메소드

}

class Triangle extends Shape {
	int height;
	int width;

	public Triangle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

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
		// Shape s = new Shape();//추상클래스는 인스턴스를 만들 수 없다
		// 상속을 통해 추상적인 동작을 자식 클래스들이 구체적인 동작으로 구현해야됨

		Shape s = new Triangle(10,20);
		Triangle t = new Triangle(20,30);
		t.height = 10;
		t.width = 20;

		Rectangle r = new Rectangle();
		r.height = 5;
		r.width = 10;
		t.printArea();
		r.printArea();
	}
}
