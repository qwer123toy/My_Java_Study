/*
 	객체지향
 
 */

// 
class Korean {

	String name;
	int age;

	// 메소드 생성
	public void introduce() {
		System.out.println("안녕하세요");
		System.out.println("제 이름은 " + name);
		System.out.println("제 나이는 " + age);
	}
}

public class TestObject6 {
	public static void main(String[] args) {

		Korean k = new Korean();
		k.name = "김씨";
		k.age = 13;
		

		Korean l = new Korean();
		l.name = "이씨";
		l.age = 15;
		
		k.introduce();
		l.introduce();
		
		Korean d = new Korean();
		d.name = "도씨";
		d.age = 17;
		d.introduce();
		
		
		
	}
}
