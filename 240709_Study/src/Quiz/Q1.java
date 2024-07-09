package Quiz;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class Q1 extends JFrame implements ActionListener {
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btnConfirm;
	private int price = 0;
	private JTextField textField;
	private JCheckBox chk3;
	private JLabel lblNewLabel_3;
	private JCheckBox chk1;
	private JCheckBox chk2;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;

	public Q1() {
		super("피자 가게");
		getContentPane().setLayout(null);

		JPanel pnl = new JPanel();
		pnl.setBounds(23, 30, 221, 281);
		pnl.setLayout(null);
		// pnl.add(btnConfirm);
		getContentPane().add(pnl);
		textField = new JTextField("1");
		lblNewLabel_3 = new JLabel("현재 선택 메뉴 가격 : 10000원");
		chk1 = new JCheckBox("피클 추가(500원)");
		chk2 = new JCheckBox("갈릭 소스 추가(700원)");
		chk3 = new JCheckBox("건빵 추가(3000원)");

		rdbtnNewRadioButton = new JRadioButton("\uD558\uC640\uC774\uC548 \uD53C\uC790");
		rdbtnNewRadioButton.setBounds(90, 51, 129, 23);
		rdbtnNewRadioButton.setSelected(true);
		pnl.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(this);

		rdbtnNewRadioButton_1 = new JRadioButton("\uBD88\uACE0\uAE30\uD53C\uC790");
		rdbtnNewRadioButton_1.setBounds(90, 132, 113, 23);
		pnl.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(this);

		rdbtnNewRadioButton_2 = new JRadioButton("\uBCD1\uC5ED\uAE30\uD53C\uC790");
		rdbtnNewRadioButton_2.setBounds(90, 210, 113, 23);
		pnl.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.addActionListener(this);

		textField.addActionListener(this);

		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdbtnNewRadioButton);
		btnGroup.add(rdbtnNewRadioButton_1);
		btnGroup.add(rdbtnNewRadioButton_2);
		pnl.setBorder(BorderFactory.createTitledBorder("피자 선택"));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Q1.class.getResource("/Quiz/image/hawai.png")));
		lblNewLabel.setBounds(12, 27, 70, 70);
		pnl.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Q1.class.getResource("/Quiz/image/bulgogi.jpg")));
		lblNewLabel_1.setBounds(12, 107, 70, 70);
		pnl.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Q1.class.getResource("/Quiz/image/byung2.jpg")));
		lblNewLabel_2.setBounds(12, 187, 76, 80);
		pnl.add(lblNewLabel_2);

		JLabel lblNewLabel_5 = new JLabel("10,000원");
		lblNewLabel_5.setBounds(111, 80, 57, 15);
		pnl.add(lblNewLabel_5);

		JLabel lblNewLabel_5_1 = new JLabel("12,000원");
		lblNewLabel_5_1.setBounds(111, 161, 57, 15);
		pnl.add(lblNewLabel_5_1);

		JLabel lblNewLabel_5_2 = new JLabel("1,000,000원");
		lblNewLabel_5_2.setBounds(111, 239, 92, 15);
		pnl.add(lblNewLabel_5_2);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(BorderFactory.createTitledBorder("추가 메뉴"));
		panel_1.setBounds(416, 30, 215, 281);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);

		chk1.setBounds(43, 22, 164, 23);
		chk1.addActionListener(this);
		panel_1.add(chk1);

		chk2.setBounds(43, 47, 164, 23);
		chk2.addActionListener(this);
		panel_1.add(chk2);

		chk3.setBounds(43, 72, 164, 23);
		chk3.addActionListener(this);
		panel_1.add(chk3);

		JButton btnNewButton = new JButton("전체 취소");
		btnNewButton.setBounds(50, 124, 122, 54);
		panel_1.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				chk1.setSelected(false);
				chk2.setSelected(false);
				chk3.setSelected(false);

				int pizzaPrice = 0;
				if (rdbtnNewRadioButton.isSelected()) {
					pizzaPrice = 10000;
				} else if (rdbtnNewRadioButton_1.isSelected()) {
					pizzaPrice = 12000;
				} else if (rdbtnNewRadioButton_2.isSelected()) {
					pizzaPrice = 1000000;
				}

				if (pizzaPrice != 0) {
					try {
						int pizzaCount = Integer.parseInt(textField.getText());
						pizzaPrice = pizzaPrice * pizzaCount;
						if (chk1.isSelected())
							pizzaPrice += 500;
						if (chk2.isSelected())
							pizzaPrice += 700;
						if (chk3.isSelected())
							pizzaPrice += 3000;
						lblNewLabel_3.setText("현재 선택 메뉴 가격 : " + pizzaPrice + "원");

					} catch (Exception e2) {
						lblNewLabel_3.setText("수량을 올바르게 입력해주세요.");
					}

				}
			}
		});
		btnNewButton.addActionListener(this);

		JButton btnNewButton_1 = new JButton("전체 선택");
		btnNewButton_1.setBounds(50, 206, 122, 54);
		panel_1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				chk1.setSelected(true);
				chk2.setSelected(true);
				if (!rdbtnNewRadioButton_2.isSelected())
					chk3.setSelected(true);

				int pizzaPrice = 0;
				if (rdbtnNewRadioButton.isSelected()) {
					pizzaPrice = 10000;
				} else if (rdbtnNewRadioButton_1.isSelected()) {
					pizzaPrice = 12000;
				} else if (rdbtnNewRadioButton_2.isSelected()) {
					pizzaPrice = 1000000;
				}

				if (pizzaPrice != 0) {
					try {
						int pizzaCount = Integer.parseInt(textField.getText());
						pizzaPrice = pizzaPrice * pizzaCount;
						if (chk1.isSelected())
							pizzaPrice += 500;
						if (chk2.isSelected())
							pizzaPrice += 700;
						if (chk3.isSelected())
							pizzaPrice += 3000;
						lblNewLabel_3.setText("현재 선택 메뉴 가격 : " + pizzaPrice + "원");

					} catch (Exception e2) {
						lblNewLabel_3.setText("수량을 올바르게 입력해주세요.");
					}

				}

			}
		});

		JPanel panel = new JPanel();
		panel.setBounds(256, 30, 128, 281);
		getContentPane().add(panel);
		panel.setBorder(BorderFactory.createTitledBorder("수량"));
		panel.setLayout(null);

		textField.setBounds(12, 20, 54, 21);

		panel.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("\uAC1C");
		lblNewLabel_4.setBounds(71, 23, 57, 15);
		panel.add(lblNewLabel_4);

		lblNewLabel_3.setBounds(228, 338, 229, 32);
		getContentPane().add(lblNewLabel_3);
		setSize(700, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Q1().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int pizzaPrice = 0;
		if (rdbtnNewRadioButton.isSelected()) {
			pizzaPrice = 10000;
			chk3.setEnabled(true);
		} else if (rdbtnNewRadioButton_1.isSelected()) {
			pizzaPrice = 12000;
			chk3.setEnabled(true);
		} else if (rdbtnNewRadioButton_2.isSelected()) {
			pizzaPrice = 1000000;
			chk3.setSelected(false);
			chk3.setEnabled(false);
		}

		if (pizzaPrice != 0) {
			try {
				int pizzaCount = Integer.parseInt(textField.getText());
				pizzaPrice = pizzaPrice * pizzaCount;
				if (chk1.isSelected())
					pizzaPrice += 500;
				if (chk2.isSelected())
					pizzaPrice += 700;
				if (chk3.isSelected())
					pizzaPrice += 3000;
				lblNewLabel_3.setText("현재 선택 메뉴 가격 : " + pizzaPrice + "원");

			} catch (Exception e2) {
				lblNewLabel_3.setText("수량을 올바르게 입력해주세요.");
			}

		}
	}
}
