class MyClass{
	int a;
	static int num;// 정적 변수
	public void increase() {
		a++;
		num++;
	}
}
public class TestDynamicAndStatic {
	public static void main(String[] args) {
		MyClass instance = new MyClass();
		MyClass anotherInstance = new MyClass();
		
		instance.increase();
		instance.increase();
		instance.increase();
		System.out.println(MyClass.num);
		System.out.println(instance.a);
		anotherInstance.increase();
		System.out.println(anotherInstance.a);
		System.out.println(MyClass.num);
	}
}
