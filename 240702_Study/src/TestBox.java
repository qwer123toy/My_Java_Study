class Box {
	protected int width;
	private int length;
	private int height;

	public Box( int width, int length, int height) {
		super();
		this.width = width;
		this.length = length;
		this.height = height;
	}


	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	public int getVolume() {
		return width * length * height;
	}
	
	public void printStatus() {
		System.out.println("�ڽ��� ���� : " + width);
		System.out.println("�ڽ��� ���� : " + length);
		System.out.println("�ڽ��� ���� : " + height);
	}

}

public class TestBox {
	public static void main(String[] args) {
		ColorBox red = new ColorBox(10, 20, 30, "RED");
		//red.printStatus();
		PasswordBox pass = new PasswordBox(20, 30, 50, "1q2w3e4r1!");
		pass.printStatus("Admin");
		pass.printStatus("User1");
	}
}
