
//�������̽��� �ʵ带 ���� �� ����
//�޼ҵ�� �߻� �޼ҵ常 ���� �� ����
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
