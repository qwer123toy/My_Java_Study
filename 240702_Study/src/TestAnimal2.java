
public class TestAnimal2 {
	public static void main(String[] args) {
//		Animal a = new Animal("동물", 2);
//		Dog d = (Dog) a; // 다운캐스팅 오류 발생

		Animal a = new Dog("갱얼쥐", 3);
		
		Dog d = (Dog) a;
		
		d.bark();
		//Cat cat = (Cat) a;
		System.out.println(a instanceof Cat); // 클래스 형을 비교
		System.out.println(a instanceof Dog);
	}
}
