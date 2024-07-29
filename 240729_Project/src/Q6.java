import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Q6 extends JFrame {

	public Q6() {
		super("버튼 생성");
		setLayout(new BorderLayout());

		JPanel pnl = new JPanel();
		pnl.setLayout(new FlowLayout());

		JTextField tf = new JTextField(5);
		JButton makeBtn = new JButton("버튼 생성");
		pnl.add(tf);
		pnl.add(makeBtn);
		add(pnl, "North");

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(3, 0, 5, 5));

		add(buttonPanel, "Center");
		makeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buttonPanel.removeAll();
				int[] lottoNumCheck = new int[45];
				int column = Integer.parseInt(tf.getText());
				buttonPanel.setLayout(new GridLayout(0, column, 100, 5));

				for (int i = 0; i < Integer.parseInt(tf.getText()); i++) {
					JPanel newPanel = new JPanel();
					newPanel.setLayout(new BorderLayout());
					JPanel newPanelNorth = new JPanel();
					JPanel newPanelCenter = new JPanel();

					JButton btn3 = new JButton("자동");
					JButton btn4 = new JButton("수동");
					JButton btn5 = new JButton("반자동");

					newPanelNorth.add(btn3);
					newPanelNorth.add(btn4);
					newPanelNorth.add(btn5);
					newPanel.add(newPanelNorth, "North");

					for (int j = 0; j < 45; j++) {
						if (j < 9) {
							lottoNumCheck[j] = j + 1;
							JCheckBox chkBox = new JCheckBox(String.valueOf("0" + lottoNumCheck[j]));
							newPanelCenter.add(chkBox);
						} else {
							lottoNumCheck[j] = j + 1;
							JCheckBox chkBox = new JCheckBox(String.valueOf(lottoNumCheck[j]));
							newPanelCenter.add(chkBox);
						}

					}
					newPanel.add(newPanelCenter, "Center");

					buttonPanel.add(newPanel);
				}

				buttonPanel.revalidate();// 레이아웃 새로 계산
				buttonPanel.repaint();// 변경된 점 새로 그리기
//				setSize(250 * column, 500);
			}
		});
		setResizable(false);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Q6().setVisible(true);
	}
}
