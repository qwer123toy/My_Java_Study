package Static;

class SomeClass {
	int num;
	static int i;

	public void print() {
		System.out.println("�ν��Ͻ� �޼ҵ忡��");
		System.out.println("�ʵ� ���� : " + num);
		System.out.println("���� ���� ���� : " + i);
	}
	//static �޼ҵ忡���� static ������ static �޼ҵ常 ���� ������(�Ϲ� �ʵ尪�̳� �޼ҵ忡�� ���� �Ұ���)
}

public class TestStatic {
	public static void main(String[] args) {
		SomeClass sc = new SomeClass();
		sc.print();
		SomeClass.i = 2;
		sc.print();
		
	}
}
