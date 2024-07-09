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
		super("입력 양식");

		JPanel pnl = new JPanel();
		JRadioButton rdoBoneless = new JRadioButton("순살");
		rdoBoneless.setSelected(true);
		JRadioButton rdoBone = new JRadioButton("뼈");

		rdoBoneless.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("내가 순살이요");
			}
		});
		
		ItemListener itemListener = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				System.out.println("상태 바뀜");
			}
		};
		rdoBone.addItemListener(itemListener);
		rdoBoneless.addItemListener(itemListener);
		
		
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(rdoBoneless);
		btnGroup.add(rdoBone);
		pnl.setBorder(BorderFactory.createTitledBorder("뼈/순살 선택"));
		
		pnl.add(rdoBone);
		pnl.add(rdoBoneless);
		
		JPanel pnlEast = new JPanel();
		
		JRadioButton btnFried = new JRadioButton("후라이드");
		JRadioButton btnSeasoned = new JRadioButton("양념");
		ButtonGroup btnGroup2 = new ButtonGroup();
		pnlEast.setBorder(BorderFactory.createTitledBorder("후/양 선택"));
		
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
