import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
	public MyFrame() {
		super("À©µÎ¿ì");
		setSize(500, 500);
		JLabel lbl = new JLabel("text");
		add(lbl);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyFrame my = new MyFrame();
		my.setVisible(true);
	}
}
