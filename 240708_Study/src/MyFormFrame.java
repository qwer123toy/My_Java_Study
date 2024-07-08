import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFormFrame extends JFrame implements ActionListener{
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btnConfirm;
	public MyFormFrame() {
		super("입력 양식");

		JPanel pnl = new JPanel();
		JLabel lblName = new JLabel("이름");
		tfName = new JTextField(20);
		tfName.addActionListener(this);
		btnConfirm = new JButton("입력");
		btnConfirm.addActionListener(this);
		lblResult = new JLabel();
		JButton btnReset = new JButton("리셋");
		
		btnReset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				tfName.setText("");
				lblResult.setText("");
			}
		});
		
		pnl.add(lblName);
		pnl.add(tfName);
		pnl.add(btnConfirm);
		pnl.add(btnReset);
		pnl.add(lblResult);
		
		add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyFormFrame().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input = tfName.getText();
		System.out.println("사용자 입력 값 : " + input);
		lblResult.setText(input);
	}
}
