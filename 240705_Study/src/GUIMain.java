import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIMain {
	public static void main(String[] args) {
		JFrame frame = new JFrame("���� �ű� ��� �ϳ� ������ ���");
		JLabel lblText = new JLabel("�� 3�����̾�~");
		
		frame.add(lblText);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
