import javax.swing.JOptionPane;

public class TestOptionPane {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("문자열을 입력해주세요");
		
		System.out.println("사용자 입력 확인 : " + input);
	}
}
