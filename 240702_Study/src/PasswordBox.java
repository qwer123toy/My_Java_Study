
public class PasswordBox extends Box {
	private String password;

	public PasswordBox(int width, int length, int height, String color) {
		super(width, length, height);
		this.password = color;
	}

	
	public void printStatus(String role) { //�����ε�
		if(role.equalsIgnoreCase("Admin"))
		System.out.println("�ڽ��� ��й�ȣ : " + password);
		super.printStatus();
	}

}
