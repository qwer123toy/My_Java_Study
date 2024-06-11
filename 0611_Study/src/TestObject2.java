/*
 	객체지향
 
 */

// Dog 클래스 생성
class Dog {

	// 상태(state)
	// 변수로 선언
	// 필드 or 멤버 변수
	int dogAge = 6;

}

public class TestObject2 {
	public static void main(String[] args) {

		Dog d = new Dog();
		d.dogAge = 4;
		System.out.println(d.dogAge);

		Dog d2 = new Dog();
		d.dogAge = 4;
		System.out.println(d2.dogAge);

	}
}
