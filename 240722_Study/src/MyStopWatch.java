import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyStopWatch extends JFrame {
	private int number = 0;
	
	public MyStopWatch() {
		super("스탑 워치");
		
		JLabel lbl = new JLabel(String.valueOf(number));
		
		JButton btnStart = new JButton("시작");
		JButton btnStop = new JButton("정지");
		
		Timer timer = new Timer(17, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number++;
				lbl.setText(String.valueOf(number));
			}
		});
		
		btnStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				timer.start();
			}
		});
		
		btnStop.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				timer.stop();
			}
		});
		JPanel pnlTop = new JPanel();
		pnlTop.add(btnStart);
		pnlTop.add(btnStop);
		
		JPanel pnlCenter = new JPanel();
		pnlCenter.add(lbl);
		
		add(pnlTop, "North");
		add(pnlCenter, "Center");
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MyStopWatch().setVisible(true);
	}
}





