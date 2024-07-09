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

public class TestPriceCheckBox extends JFrame implements ActionListener {
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btnConfirm;
	private int price = 0;

	public TestPriceCheckBox() {
		super("�Է� ���");

		JPanel pnl = new JPanel();
		JCheckBox chk1 = new JCheckBox("�ܹ��� �߰�(500��)");
		JCheckBox chk2 = new JCheckBox("��Ŭ �߰�(700��)");
		JCheckBox chk3 = new JCheckBox("������ �߰�(3000��)");
		// JButton btnConfirm = new JButton("�߰���� ���");
		JLabel lbl = new JLabel("0��");

		chk1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (chk1.isSelected()) {
					price += 500;
					lbl.setText(price + "��");
				} else {
					price -= 500;
					lbl.setText(price + "��");
				}
			}
		});

		chk2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (chk2.isSelected()) {
					price += 700;
					lbl.setText(price + "��");
				} else {
					price -= 700;
					lbl.setText(price + "��");
				}
			}
		});

		chk3.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if (chk3.isSelected()) {
					price += 3000;
					lbl.setText(price + "��");
				} else {
					price -= 3000;
					lbl.setText(price + "��");
				}
			}
		});

//		btnConfirm.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				int price = 0;
//				if(chk1.isSelected()) {
//					price += 500;
//				}
//				if(chk2.isSelected()) {
//					price += 700;
//				}
//				if(chk3.isSelected()) {
//					price += 3000;
//				}
//				JOptionPane.showMessageDialog(TestPriceCheckBox.this, "�߰� ����� " + price + "���Դϴ�.");
//			}
//		});
//		

		pnl.add(chk1);
		pnl.add(chk2);
		pnl.add(chk3);
		pnl.add(lbl);
		// pnl.add(btnConfirm);
		add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestPriceCheckBox().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
