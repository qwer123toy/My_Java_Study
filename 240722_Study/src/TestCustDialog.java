import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class MyFormData {
	private String firstInput;
	private String SecondInput;
	private boolean isConfirm;

	public MyFormData(String firstInput, String secondInput) {
		super();
		this.firstInput = firstInput;
		SecondInput = secondInput;
	}

	String getFirstInput() {
		return firstInput;
	}

	void setFirstInput(String firstInput) {
		this.firstInput = firstInput;
	}

	String getSecondInput() {
		return SecondInput;
	}

	boolean isConfirm() {
		return isConfirm;
	}

	void setConfirm(boolean isConfirm) {
		this.isConfirm = isConfirm;
	}

	void setSecondInput(String secondInput) {
		SecondInput = secondInput;
	}

}

class MyDialog extends JDialog {

	private MyFormData data;
	private JTextField tf1;
	private JTextField tf2;

	public MyDialog(MyFrame frame) {
		setTitle("대화 상자");

		data = new MyFormData(null, null);
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);

		JPanel pnl = new JPanel();
		pnl.add(tf1);
		pnl.add(tf2);

		JPanel pnlNorth = new JPanel();
		JButton btnConfirm = new JButton("입력 완료");
		JButton btnCancel = new JButton("취소");

		pnlNorth.add(btnConfirm);
		pnlNorth.add(btnCancel);
		add(pnl);

		add(pnlNorth, "North");

		ActionListener listener = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == btnConfirm) {
					data.setConfirm(true);
				}
				dispose();

			}
		};
		btnConfirm.addActionListener(listener);
		btnCancel.addActionListener(listener);

		setModal(true);
		// 생성된 프레임이 종료되지 않으면 이전 프레임을 작동할 수 없음

		setSize(500, 500);
		setLocationRelativeTo(frame);

		int x = frame.getX();
		int y = frame.getY();
		int width2 = frame.getWidth();

		setLocation(x + width2, y);

		// 창이 닫힐 때 대화 상자를 폐기(dispose)하고, 관련된 모든 리소스를 해제
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public MyFormData showDialog() {
		setVisible(true);

		data.setFirstInput(tf1.getText());
		data.setSecondInput(tf2.getText());

		return data;

	}
}

class MyFrame extends JFrame {

	public MyFrame() {
		super("메인 창");

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JButton btnOpenDialog = new JButton("다이얼로그 열기");
		add(btnOpenDialog);
		btnOpenDialog.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				MyDialog dialog = new MyDialog(MyFrame.this);
				MyFormData formData = dialog.showDialog();

				if(formData.isConfirm()) {
					System.out.println("입력이 완료되었으며, 입력값은");
					System.out.println(formData.getFirstInput());
					System.out.println(formData.getSecondInput());
				}else {
					System.out.println("취소");
				}
//				dialog.setVisible(true);
//
//				System.out.println("언제 실행될까요!");// dialog가 닫히면 실행됨
			}
		});
	}
}

public class TestCustDialog {
	public static void main(String[] args) {
		new MyFrame().setVisible(true);
	}
}
