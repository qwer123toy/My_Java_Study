import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyEnableFrame extends JFrame implements ActionListener{
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btnLeft;
	private JButton btnRight;
	
	public MyEnableFrame() {
		super("활성화");
		JPanel pnl = new JPanel();
		btnLeft = new JButton("왼쪽");
		btnRight = new JButton("오른쪽");
		btnRight.setEnabled(false);
		btnLeft.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btnLeft.setEnabled(false);
				btnRight.setEnabled(true);		
			}
		});
		btnRight.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btnLeft.setEnabled(true);
				btnRight.setEnabled(false);		
			}
		});
		
		pnl.add(btnLeft);
		pnl.add(btnRight);
		
		add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyEnableFrame().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		btnLeft.setEnabled(false);
		btnRight.setEnabled(true);		
		
	}
}
