/*
 	객체지향
 
 */

// 
class Square {
	int width;
	int height;

	public void round() {
		System.out.println(2*(width+height));
	}

	public void area() {
		System.out.println(width*height);
	}

}

public class WriteClass2 {
	public static void main(String[] args) {
		Square s = new Square();
		s.width = 10;
		s.height = 20;
		s.round();
		s.area();
		int width = 10;
		int height = 20;
		System.out.println(width * height);
	}
}
