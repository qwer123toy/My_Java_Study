package Quiz;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class Q3 extends JFrame implements ActionListener {
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btnConfirm;
	private int btnX =0;
	private int btnY =0;
	public Q3() {
		super("¿Ãµø");

//		JPanel pnl = new JPanel();
		
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setBounds(0, 0, 10, 10);
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				//System.out.println(keyCode);
				
				if(keyCode ==37)
					btnX -=10;
				if(keyCode ==38)
					btnY -=10;
				if(keyCode ==39)
					btnX +=10;
				if(keyCode ==40)
					btnY +=10;
					btnNewButton.setBounds(btnX, btnY, 10, 10);
			}
		});
		getContentPane().add(btnNewButton);
	}

	public static void main(String[] args) {
		new Q3().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
	}
}
