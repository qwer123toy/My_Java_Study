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

public class MyLoginFrame extends JFrame implements ActionListener{
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btnLogin;
	public MyLoginFrame() {
		super("�Է� ���");

		JPanel pnl = new JPanel();
		JLabel lblID = new JLabel("���̵�");
		tfName = new JTextField(10);
		JLabel lblPw = new JLabel("��й�ȣ");
		JPasswordField tfPW = new JPasswordField(10);
		btnLogin = new JButton("�α���");
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String id = tfName.getText();
				String pw = tfPW.getText();
//				System.out.println(Arrays.toString(tfPW.getPassword()));
				if(id.equals("admin") && pw.equals("1q2w3e")) {
					JOptionPane.showMessageDialog(MyLoginFrame.this, "ȯ���մϴ�");
				}else {
					JOptionPane.showMessageDialog(MyLoginFrame.this, "���̵�� ��й�ȣ�� Ȯ���ϼ���","�α��� ����",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		pnl.add(lblID);
		pnl.add(tfName);
		pnl.add(lblPw);
		pnl.add(tfPW);
		pnl.add(btnLogin);
		
		add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyLoginFrame().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println();
		
	}
}
