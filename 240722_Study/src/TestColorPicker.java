import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class MyColorPicker extends JDialog {

	private JTextField tfRed;
	private JTextField tfGreen;
	private JTextField tfBlue;

	public MyColorPicker() {
		setModal(true);

		JPanel pnl = new JPanel();
		tfRed = new JTextField(5);
		tfGreen = new JTextField(5);
		tfBlue = new JTextField(5);
		
		pnl.add(tfRed);
		pnl.add(tfGreen);
		pnl.add(tfBlue);
		
		add(pnl);
		setSize(500, 500);
	}

	public Color showDialog() {
		setVisible(true);
		
		String red = tfRed.getText();
		String green = tfGreen.getText();
		String blue = tfBlue.getText();
		
		
		return new Color(Integer.valueOf(red), Integer.valueOf(green), Integer.valueOf(blue));


	}
}

public class TestColorPicker extends JFrame {

	public TestColorPicker() {
		super("qorudtor 선택");

		JButton btn = new JButton("색상 선택창");

		add(btn, "North");
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
//				Color color = JColorChooser.showDialog(TestColorPicker.this, "배경색 선택", Color.WHITE);
				
				MyColorPicker picker = new MyColorPicker();
				
				Color color = picker.showDialog(); 
				
				getContentPane().setBackground(color);
			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestColorPicker().setVisible(true);
	}
}
