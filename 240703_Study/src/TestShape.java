abstract class Shape {// �߻� Ŭ����

	public abstract void printArea(); // ��� �޼ҵ�

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
		// Shape s = new Shape();//�߻�Ŭ������ �ν��Ͻ��� ���� �� ����
		// ����� ���� �߻����� ������ �ڽ� Ŭ�������� ��ü���� �������� �����ؾߵ�

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
