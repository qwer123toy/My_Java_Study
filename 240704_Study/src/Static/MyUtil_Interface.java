package Static;

public interface MyUtil_Interface { // �������̽������� �߻� �޼ҵ�� ������� �������� �����ϴ� ��� or ���� �޼ҵ尡 ���� ����
	public static final int num = 0;//�������̽����� �����ϴ� ������ ���� ������ static final ���
	
	public static void print() {
		System.out.println("���");
	}
	
	public static void main(String[] args) {
		System.out.println(MyUtil_Interface.num);
		MyUtil_Interface.print();
	}
}
