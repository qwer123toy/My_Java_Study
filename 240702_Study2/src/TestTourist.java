//�ѱ����� �λ��Ҽ� �մ� ������
// �̸�
//�λ��ϱ�

//����� �λ� ����
// �̸�
//�λ��ϱ�
class Tourist{
	private String name;

	public Tourist(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void sayHi() {
		System.out.println("�������� �λ縦 �մϴ�.");
	}
	
}

class KoreanTourist extends Tourist{

	public KoreanTourist(String name) {
		super(name);

	}
	@Override
	public void sayHi() {
		System.out.println("�ȳ�! �� �̸��� " + getName());
	}
	
}

class EnglishTourist extends Tourist{

	public EnglishTourist(String name) {
		super(name);

	}

	@Override
	public void sayHi() {
		// TODO Auto-generated method stub
		System.out.println("Hi! My name is " + getName());
	}

	
}


public class TestTourist {
	public static void main(String[] args) {
		Tourist[] tourists = {new KoreanTourist("�浿"), new EnglishTourist("Tom"), new KoreanTourist("�Ѹ�"), new EnglishTourist("Bred")};
		for(int i=0; i<tourists.length; i++) {
			tourists[i].sayHi();
		}
	}
}
