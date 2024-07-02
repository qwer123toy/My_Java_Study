
public class ColorBox extends Box {
	private String color;

	public ColorBox(int width, int length, int height, String color) {
		super(width, length, height);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorBox [color=" + color + "]";
	}
	
	@Override // @ > Annotation
	//Overide Annotation �� �����ڰ� �������̵��� �ǵ��� ���� �� �θ��� �޼ҵ� ���� �߿���
	//�ش��ϴ� �޼ҵ� ��ġ ���θ� ������ �ܰ迡�� Ȯ����
	public void printStatus() {
		System.out.println("�ڽ��� ���� : " + color);
		System.out.println("�ڽ��� ���� : " + this.getWidth());
		System.out.println("�ڽ��� ���� : " + super.getWidth());
		System.out.println("�ڽ��� ���� : " + getWidth());//getter
		System.out.println("�ڽ��� ���� : " + width);//protected
		
		System.out.println("�ڽ��� ���� : " + getLength());
		System.out.println("�ڽ��� ���� : " + super.getHeight());
	}

}
