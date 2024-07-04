package Static;

class SomeClass {
	int num;
	static int i;

	public void print() {
		System.out.println("인스턴스 메소드에서");
		System.out.println("필드 접근 : " + num);
		System.out.println("전역 변수 접근 : " + i);
	}
	//static 메소드에서는 static 변수나 static 메소드만 접근 가능함(일반 필드값이나 메소드에는 접근 불가능)
}

public class TestStatic {
	public static void main(String[] args) {
		SomeClass sc = new SomeClass();
		sc.print();
		SomeClass.i = 2;
		sc.print();
		
	}
}
