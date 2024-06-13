
public class Triangle {

	int width;
	int height;

	//클래스에 생성자를 하나 이상 정의하면
	//기본 생성자를 자동으로 정의하지 않음
	public Triangle() {
		width =5;
		height = 4;
	}
	public Triangle(int w, int h) {
		width = w;
		height = h;
	}


	public static void main(String[] args) {

		Triangle r = new Triangle();
		Triangle r2 = new Triangle(3,2);
		
		System.out.println(r.width);
		System.out.println(r.height);
		System.out.println(r2.width);
		System.out.println(r2.height);
		
	}
}
