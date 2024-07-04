
//인터페이스는 필드를 가질 수 없음
//메소드는 추상 메소드만 가질 수 있음
public interface MyInterface {
	public abstract void printHello();
}

class MyImple implements MyInterface{

	@Override
	public void printHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}
	
}
class YourImple implements MyInterface{

	@Override
	public void printHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello2");
	}
	
}
