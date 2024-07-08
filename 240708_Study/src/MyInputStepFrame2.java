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

public class MyInputStepFrame2 extends JFrame implements ActionListener{
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btnNext;
	private JButton btnFin;
	private JButton btnClear;
	JTextField txfield1;
	JTextField txfield2;
	public MyInputStepFrame2() {
		super("활성화");
		JPanel pnl = new JPanel();
		 txfield1 = new JTextField(10);
		btnNext = new JButton("다음");
		txfield1.addActionListener(this);
		 txfield2 = new JTextField(10);
		btnFin = new JButton("완료");
		btnFin.setForeground(Color.RED);
		btnFin.setBackground(Color.LIGHT_GRAY);
		txfield2.setEnabled(false);
		btnClear =  new JButton("초기화");
		btnFin.setEnabled(false);
		btnClear.setEnabled(false);
		btnNext.addActionListener(this);
		
		btnFin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String input = txfield2.getText();
				if(input.length()>0)
				JOptionPane.showMessageDialog(MyInputStepFrame2.this, txfield2.getText());
				else
					JOptionPane.showMessageDialog(MyInputStepFrame2.this, "값이 없습니다");
			}
		});
		
		btnClear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txfield2.setEnabled(false);
				txfield2.setText("");
				txfield1.setText("");
				btnFin.setEnabled(false);
				txfield1.setEnabled(true);
				btnNext.setEnabled(true);
				
				btnClear.setEnabled(false);
			}
		});
		
		pnl.add(txfield1);
		pnl.add(btnNext);
		pnl.add(txfield2);
		pnl.add(btnFin);
		pnl.add(btnClear);
		getContentPane().add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyInputStepFrame2().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input = txfield1.getText();
		if(input.length()>0) {
			txfield2.setEnabled(true);
			btnFin.setEnabled(true);
			
			txfield1.setEnabled(false);
			btnNext.setEnabled(false);
			btnClear.setEnabled(true);
		}
		else {
			txfield2.setEnabled(false);
			btnFin.setEnabled(false);
		}
			
	}
	}

