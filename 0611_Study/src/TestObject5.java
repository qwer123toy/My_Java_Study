/*
 	객체지향
 
 */

// 오리 클래스 생성
class Duck {

	//메소드 생성
	public void quack() {
		System.out.println("꽥꽥");
	}
}

public class TestObject5 {
	public static void main(String[] args) {

	Duck d = new Duck();
	d.quack();//오리 클래스의 메소드 호출

	}
}
