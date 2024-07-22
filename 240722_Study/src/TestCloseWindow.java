import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TestCloseWindow extends JFrame {
	public TestCloseWindow() {

		addWindowListener(new WindowListener() {

			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("창이 열렸을 때");
			}

			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("창이 아이콘화될 때");
			}

			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("창이 비아이콘화될 때");
			}

			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("창이 비활성화될 때");
			}

			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				int input = JOptionPane.showOptionDialog(TestCloseWindow.this, "정말로 창을 닫으시겠습니까", "확인",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
				if(input == JOptionPane.YES_OPTION) {
					dispose();
				}
				System.out.println("창을 닫으려고 할 때");
			}

			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("창이 닫혔을 때");
			}

			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("창이 활성화될 때");
			}
		});
		setSize(500, 500);
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestCloseWindow().setVisible(true);
	}
}
