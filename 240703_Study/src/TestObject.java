
public class TestObject {
	public static void main(String[] args) {
		
		Object book = new Book("å",200,"�۰��̸�");
		Object str = new String("���ڿ�");
		Object duck = new Duck(3);
		//Object�� �ڹٿ� �⺻������ ����ִ� ��ü��� Ŭ����
		//��� Ŭ������ �⺻������ Object Ŭ������ �θ� Ŭ������ ���� ����
		System.out.println(book.toString());
		System.out.println(str.toString());
		System.out.println(duck.toString());
	}
}
