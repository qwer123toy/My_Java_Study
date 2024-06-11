/* Object Oriented Programming
 * object 객체란 상태(state)와 동작(behavior)을 가지며, 
 * 해당 상태와 동작을 묶어 하나의 단위로 표현한 것
 * 
 * class 클래스란 객체에 대한 설계도, 즉 특정한 종류의 객체를 만들어내는 형틀
 * member 필드와 메소드
 * field 객체의 속성을 나타냄, 즉 변수들
 * method 클래스 안에 정의된 함수
 * 
 * state 객체의 속성, 변수
 * behavior 객체의 행동, 함수
 * 
 * instance 클래스로부터 만들어지는 각각의 객체들을 해당 클래스의 인스턴스라고 한다
 * 
 * reference type 참조 변수란 객체를 참조할 때 사용되는 변수, 객체의 참조값이 저장됨
 */


public class CatTest {
	public static void main(String[] args) {
		Cat2 c = new Cat2();
		c.name = "나비";
		c.age = 7;
		c.gender= "암컷";
		System.out.println(c.showName());
		System.out.println(c.showAge());
		System.out.println(c.showGender());
		
	}
}
