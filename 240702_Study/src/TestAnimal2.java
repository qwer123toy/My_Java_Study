
public class TestAnimal2 {
	public static void main(String[] args) {
//		Animal a = new Animal("����", 2);
//		Dog d = (Dog) a; // �ٿ�ĳ���� ���� �߻�

		Animal a = new Dog("������", 3);
		
		Dog d = (Dog) a;
		
		d.bark();
		//Cat cat = (Cat) a;
		System.out.println(a instanceof Cat); // Ŭ���� ���� ��
		System.out.println(a instanceof Dog);
	}
}
