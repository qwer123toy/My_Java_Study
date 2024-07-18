import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class MyLocation {
	public int x;
	public int y;

	public MyLocation(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof MyLocation))
			return false;
		MyLocation other = (MyLocation) obj;
		return x == other.x && y == other.y;
	}

}

class MyRectangle {
	public int width;
	public int height;

	public MyRectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

}

public class TestMyMap {
	public static void main(String[] args) {
		// x: 10, y: 20 = width: 10, height 20
		// x: 50, y: 60 = width: 20, height 30
		// x: 210, y: 240 = width: 30, height 10
		Map<MyLocation, MyRectangle> map = new HashMap<>();
		map.put(new MyLocation(10, 20), new MyRectangle(10, 20));
		map.put(new MyLocation(50, 60), new MyRectangle(20, 30));
		map.put(new MyLocation(210, 240), new MyRectangle(30, 10));

		MyRectangle myRectangle = map.get(new MyLocation(10, 20));
		System.out.println(myRectangle.width * myRectangle.height);
		System.out.println(myRectangle.toString()); // 동일 객체를 넣었으나 value 값에 접근할 수 없음
		// 키의 동등함을 확인하기 위한 메소드가 필요(hashCode, equals)
	}
}
