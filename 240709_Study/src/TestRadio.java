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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class TestRadio extends JFrame implements ActionListener {

	public TestRadio() {
		super("�Է� ���");

		JPanel pnl = new JPanel();
		JRadioButton rdoBoneless = new JRadioButton("����");
		rdoBoneless.setSelected(true);
		JRadioButton rdoBone = new JRadioButton("��");

		rdoBoneless.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("���� �����̿�");
			}
		});
		
		ItemListener itemListener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				System.out.println("���� �ٲ�");
			}
		};
		rdoBone.addItemListener(itemListener);
		rdoBoneless.addItemListener(itemListener);
		
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdoBoneless);
		btnGroup.add(rdoBone);
		pnl.setBorder(BorderFactory.createTitledBorder("��/���� ����"));
		
		pnl.add(rdoBone);
		pnl.add(rdoBoneless);
		
		JPanel pnlEast = new JPanel();
		
		JRadioButton btnFried = new JRadioButton("�Ķ��̵�");
		JRadioButton btnSeasoned = new JRadioButton("���");
		ButtonGroup btnGroup2 = new ButtonGroup();
		pnlEast.setBorder(BorderFactory.createTitledBorder("��/�� ����"));
		
		btnGroup2.add(btnFried);
		btnGroup2.add(btnSeasoned);
		
		
		pnlEast.add(btnFried);
		pnlEast.add(btnSeasoned);
		
		add(pnlEast,"East");

		add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestRadio().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
