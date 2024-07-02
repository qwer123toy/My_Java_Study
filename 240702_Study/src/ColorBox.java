
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
	//Overide Annotation 은 개발자가 오버라이드의 의도가 있을 때 부모의 메소드 정의 중에서
	//해당하는 메소드 일치 여부를 컴파일 단계에서 확인함
	public void printStatus() {
		System.out.println("박스의 색상 : " + color);
		System.out.println("박스의 가로 : " + this.getWidth());
		System.out.println("박스의 가로 : " + super.getWidth());
		System.out.println("박스의 가로 : " + getWidth());//getter
		System.out.println("박스의 가로 : " + width);//protected
		
		System.out.println("박스의 세로 : " + getLength());
		System.out.println("박스의 높이 : " + super.getHeight());
	}

}
