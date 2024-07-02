class Shape {

	public void printArea() {
		System.out.println("������ ���̴� ���� ����!");
	}

}

class Triangle extends Shape {
	int height;
	int width;

	@Override
	public void printArea() {
		System.out.println("�ﰢ���� ���̴� " + ((double) height * width * 0.5));
	}

}

class Rectangle extends Shape {
	int height;
	int width;

	@Override
	public void printArea() {
		System.out.println("�簢���� ���̴� " + (height * width));
	}
}

class Circle extends Shape {
	private int radius;

	@Override
	public void printArea() {
		System.out.println("���� ���̴� " + (double) radius * radius * 3.14);
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
