import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUIMain {
	public static void main(String[] args) {
		JFrame frame = new JFrame("어이 거기 담배 하나 있으면 줘라");
		JLabel lblText = new JLabel("어 3만원이야~");
		
		frame.add(lblText);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
