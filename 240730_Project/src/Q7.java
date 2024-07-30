import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Q7 extends JFrame {

	public Q7() {
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
		buttonPanel.setLayout(new GridLayout(0, 5, 5, 5));

		add(buttonPanel, "Center");
		makeBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				buttonPanel.removeAll();
				int column = Integer.parseInt(tf.getText());
				buttonPanel.setLayout(new GridLayout(column, 0, 5, 5));

				for (int i = 0; i < Integer.parseInt(tf.getText()); i++) {
					JPanel newPanel = new JPanel();

					for (int j = 0; j < 6; j++) {

						int ran = (int) (Math.random() * 45 + 1);
						BallLabel ballLabel = new BallLabel(ran);
						newPanel.add(ballLabel);

					}

					buttonPanel.add(newPanel);
				}

				buttonPanel.revalidate();// 레이아웃 새로 계산
				buttonPanel.repaint();// 변경된 점 새로 그리기
				setSize(500, 130 * column);
			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class BallLabel extends JLabel {

		public BallLabel(int number) {
			setIcon(new ImageIcon(MainPnl2.class.getResource("/img/ball3.png")));// 레이블에 이미지 불러옴
			setHorizontalTextPosition(JLabel.CENTER); // 레이블의 텍스트 가로 부분을 가운데로 고정
			setVerticalTextPosition(JLabel.CENTER);// 레이블의 텍스트 세로 부분을 가운데로 고정
			setFont(new Font("Serif", Font.BOLD, 20)); //폰트 설정
			setForeground(Color.WHITE); // 글자색깔 설정
			setText(String.valueOf(number)); // 글자 설정
			setHorizontalAlignment(SwingConstants.CENTER); // 레이블 자체의 수평 위치를 중간으로
			setVerticalAlignment(SwingConstants.CENTER); // 레이블 자체의 수 위치를 중간으로
		}
	}

	public static void main(String[] args) {
		new Q7().setVisible(true);
		List<Integer> as = new ArrayList<>();
		Collections.sort(as);
	}
}
