import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestLayoutFrame2 extends JFrame implements ActionListener{
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btn1;
	public TestLayoutFrame2() {
		super("Flow Layout");

		setLayout(new FlowLayout());
		for(int i=1; i<=3; i++) {
			JButton btn = new JButton(String.valueOf(i));
			add(btn);
		}
		JButton btnLarge = new JButton("큰버튼");
		btnLarge.setPreferredSize(new Dimension(200,200));
		add(btnLarge);
		
		JButton btnLong = new JButton("긴 버튼");
		btnLong.setPreferredSize(new Dimension(250,50));
		add(btnLong);
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestLayoutFrame2().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
