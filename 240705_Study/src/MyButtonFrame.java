import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyButtonFrame extends JFrame  {
	class MyListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("화가 많이 났죠");
		}
		
	}
	public MyButtonFrame() {
		super("윈두우");
		JPanel pnl = new JPanel();
		JButton btn = new JButton("3aksdnjs");
		JButton btn2 = new JButton("3aksdnjs");
		//add(btn);
//		JLabel lbl = new JLabel("text");
//		add(lbl);
		btn.addActionListener(new MyListener());
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("아무고토 못하죠");
				
			}
		});
		pnl.add(btn);
		pnl.add(btn2);
		add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyButtonFrame().setVisible(true);
//		MyButtonFrame my = new MyButtonFrame();
//		my.setVisible(true);
	}
}
