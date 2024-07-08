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
		super("입력 양식");

		JPanel pnl = new JPanel();
		JLabel lblID = new JLabel("아이디");
		tfName = new JTextField(10);
		JLabel lblPw = new JLabel("비밀번호");
		JPasswordField tfPW = new JPasswordField(10);
		btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String id = tfName.getText();
				String pw = tfPW.getText();
//				System.out.println(Arrays.toString(tfPW.getPassword()));
				if(id.equals("admin") && pw.equals("1q2w3e")) {
					JOptionPane.showMessageDialog(MyLoginFrame.this, "환영합니다");
				}else {
					JOptionPane.showMessageDialog(MyLoginFrame.this, "아이디와 비밀번호를 확인하세요","로그인 오류",JOptionPane.ERROR_MESSAGE);
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
