import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class TestBorder extends JFrame implements ActionListener {
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btnConfirm;

	public TestBorder() {
		super("입력 양식");

		JPanel pnl = new JPanel();
		JLabel lbl = new JLabel("Label");
		lbl.setBorder(new LineBorder(Color.BLACK,3));
		
		pnl.add(lbl);

		JLabel lbl2 = new JLabel("Label");
		lbl2.setBorder(BorderFactory.createEtchedBorder(Color.red,Color.orange));
		pnl.add(lbl2);
		add(pnl);
		JPanel pnlEast = new JPanel();
		pnlEast.setPreferredSize(new Dimension(300,0));
		pnlEast.setBorder(BorderFactory.createTitledBorder("제목 : 동쪽 패널"));
		add(pnlEast,"East");
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestBorder().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input = tfName.getText();
		System.out.println("사용자 입력 값 : " + input);
		lblResult.setText(input);
	}
}
