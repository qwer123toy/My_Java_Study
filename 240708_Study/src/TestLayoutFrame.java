import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestLayoutFrame extends JFrame implements ActionListener{
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btnConfirm;
	public TestLayoutFrame() {
		super("Border Layout");

		JPanel pnl = new JPanel();
		pnl.setPreferredSize(new Dimension(500,500));
		pnl.setBackground(Color.cyan);
			
		add(pnl);
		
		JPanel pnlNorth = new JPanel();
		pnlNorth.setPreferredSize(new Dimension(0,200));
		pnlNorth.setBackground(Color.DARK_GRAY);
		
		add(pnlNorth,"North");
		
		JPanel pnlSouth = new JPanel();
		pnlSouth.setPreferredSize(new Dimension(0,200));
		pnlSouth.setBackground(Color.YELLOW);
		
		add(pnlSouth,"South");
		
		JPanel pnlWest = new JPanel();
		pnlWest.setPreferredSize(new Dimension(200,0));
		pnlWest.setBackground(Color.BLACK);
		
		add(pnlWest,"West");
		
		pack();//자식 요소에 맞게 사이즈 조절
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestLayoutFrame().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
