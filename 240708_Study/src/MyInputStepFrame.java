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
import java.awt.Color;

public class MyInputStepFrame extends JFrame implements ActionListener{
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btnNext;
	private JButton btnFin;
	
	public MyInputStepFrame() {
		super("활성화");
		JPanel pnl = new JPanel();
		JTextField txfield1 = new JTextField(10);
		btnNext = new JButton("다음");
		JTextField txfield2 = new JTextField(10);
		btnFin = new JButton("완료");
		btnFin.setForeground(Color.RED);
		btnFin.setBackground(Color.MAGENTA);
		txfield2.setEnabled(false);
		btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = txfield1.getText();
				if(input.length()>0) {
					txfield2.setEnabled(true);
					btnFin.setEnabled(true);
				}
				else {
					txfield2.setEnabled(false);
					btnFin.setEnabled(false);
				}
					
			}
		});
		
		btnFin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(MyInputStepFrame.this, txfield2.getText());
			}
		});
		
		
		pnl.add(txfield1);
		pnl.add(btnNext);
		pnl.add(txfield2);
		pnl.add(btnFin);
		getContentPane().add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyInputStepFrame().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
