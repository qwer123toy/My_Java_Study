package Quiz;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Quiz1 extends JFrame {
	private JPanel pnl;
	private JLabel lbl;
	private JLabel lbl2;
	private JLabel lbl3 = new JLabel(" ");
	private JLabel lbl4 = new JLabel(" ");
	private JLabel lbl5 = new JLabel(" ");

	Random random;
	int i = 0;

	class Minus implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (i > 0) {
				i--;
				String num = String.valueOf(i);
				lbl.setText(num);
				lbl2.setText(" ");
			} else {
				lbl2.setText("0 이하로는 뺄 수 없습니다.");
			}
		}

	}

	class Plus implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if (i < 10) {
				i++;
				String num = String.valueOf(i);
				lbl.setText(num);
				lbl2.setText(" ");
			} else {
				lbl2.setText("10 이상으로는 더할 수 없습니다.");
			}
		}

	}

	public Quiz1() {
		super("윈두우");

		pnl = new JPanel(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(5, 5, 5, 5);

		JButton btnPlus = new JButton("더하기");
		JButton btnMinus = new JButton("빼기");

		lbl = new JLabel("0");
		lbl2 = new JLabel(" ");

		btnPlus.addActionListener(new Plus());
		btnMinus.addActionListener(new Minus());

		gbc.gridx = 0;
		gbc.gridy = 0;
		pnl.add(btnPlus, gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		pnl.add(btnMinus, gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 2;
		pnl.add(lbl3, gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		gbc.gridwidth = 2;
		pnl.add(lbl4, gbc);

		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.gridwidth = 2;
		pnl.add(lbl5, gbc);

		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 2;
		pnl.add(lbl, gbc);

		gbc.gridx = 0;
		gbc.gridy = 6;
		pnl.add(lbl2, gbc);

		add(pnl);

		setSize(300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Quiz1().setVisible(true);

	}
}
