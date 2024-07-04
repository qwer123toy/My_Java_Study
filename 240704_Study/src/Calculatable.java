interface Minusable{
	public int minus(int a, int b);
}
public interface Calculatable {
	public abstract int sum(int a, int b); // abstract ������ ���൵ �߻� �޼ҵ�� �ۼ���, private, protected �Ұ���
}

class Calculator implements Calculatable, Minusable {

	@Override
	public int sum(int a, int b) {
		System.out.println("�̸� ���� ����̿�!");
		return a + b;
	}

	@Override
	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}

class Computer implements Calculatable, Minusable {

	@Override
	public int sum(int a, int b) {
		System.out.println("��ǻŸ");
		return a + b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}

}