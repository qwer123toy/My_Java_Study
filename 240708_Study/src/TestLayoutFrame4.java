import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestLayoutFrame4 extends JFrame implements ActionListener {
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btn1;

	public TestLayoutFrame4() {
		super("Absoulte Layout");

		setLayout(null);

		JButton btn = new JButton("Siu~~~");
		btn.setLocation(200, 350);
		btn.setSize(100, 70);
		add(btn);

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestLayoutFrame4().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
