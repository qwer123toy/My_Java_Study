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

public class TestLayoutFrame3 extends JFrame implements ActionListener{
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btn1;
	public TestLayoutFrame3() {
		super("Grid Layout");

		setLayout(new GridLayout(0,2));
		for(int i=1; i<=9; i++) {
			JButton btn = new JButton(String.valueOf(i));
			add(btn);
		}
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestLayoutFrame3().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
