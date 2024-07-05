public class TestLocalClass {
	public static void main(String[] args) {
		
		//지역 메소드기 때문에 메인을 벗어나서 사용 불가
		class Point2D{
			int x;
			int y;
		}
		
		Point2D instance = new Point2D();
		instance.x=10;
		instance.y=20;
		System.out.println(instance.x);
	}

}
