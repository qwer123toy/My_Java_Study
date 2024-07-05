
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyColorFrame extends JFrame implements ActionListener{
	private JPanel pnl;
	Random random;
	
	public MyColorFrame() {
		super("윈두우");
		random = new Random();
		pnl = new JPanel();
		
		
		pnl.setBackground(new Color(46,23,128));
		
		JButton btn = new JButton("색상 변경");
		
		btn.addActionListener(this);
		
		pnl.add(btn);
		
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		System.out.println("올ㅋ");
		int r= random.nextInt(256);
		int g= random.nextInt(256);
		int b= random.nextInt(256);
		pnl.setBackground(new Color(r,g,b));
	}
	
	public static void main(String[] args) {
		new MyColorFrame().setVisible(true);
		
	}
}
