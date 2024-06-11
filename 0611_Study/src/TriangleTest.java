
public class TriangleTest {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.width = 10;
		t.height = 5;
		double area = t.getArea();
		System.out.println("삼각형의 넓이는 " + area + "입니다");
	}
}
