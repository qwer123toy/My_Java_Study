package Static;

public class StaticBlock {
	static { // �����帧�� �����ϰ� ������ static�� �̸� ������ �� main�� ����
		System.out.println("����ƽ ��");
		System.out.println("JVM�� ���� ����");
	}
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
	}
}
