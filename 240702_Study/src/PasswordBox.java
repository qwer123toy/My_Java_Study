
public class PasswordBox extends Box {
	private String password;

	public PasswordBox(int width, int length, int height, String color) {
		super(width, length, height);
		this.password = color;
	}

	
	public void printStatus(String role) { //오버로드
		if(role.equalsIgnoreCase("Admin"))
		System.out.println("박스의 비밀번호 : " + password);
		super.printStatus();
	}

}
