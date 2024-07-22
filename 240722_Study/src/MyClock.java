import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyClock extends JFrame{
	
	public MyClock() {
		super("시계");
		
		LocalTime time = LocalTime.now();
		JLabel lbl = new JLabel(time.toString());
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.add(lbl);
		
		add(pnlCenter);
		
		setSize(500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//Swing으로 import
		Timer timer = new Timer(24, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				LocalTime update = LocalTime.now();
				lbl.setText(update.toString());
			}
		});
		timer.start();
	}
	
	public static void main(String[] args) {
		new MyClock().setVisible(true);
	}
}
