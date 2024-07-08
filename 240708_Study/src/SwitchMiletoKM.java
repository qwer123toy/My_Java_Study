import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import image.MyPanel2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

public class SwitchMiletoKM extends JFrame implements ActionListener{
	private JTextField tfName;
	private JLabel lblResult;
	private JTextField textField;
	private double mile;
	private JLabel lblNewLabel_2;
	public SwitchMiletoKM() {
		super("활성화");
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uB9C8\uC77C\uC744 \uC785\uB825\uD558\uC138\uC694");
		lblNewLabel.setBounds(22, 23, 142, 49);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(255, 37, 116, 21);
		getContentPane().add(textField);
		textField.setColumns(10);
		textField.addActionListener(this);
		JLabel lblNewLabel_1 = new JLabel("거리를 마일 단위로 입력하세요");
		lblNewLabel_1.setBounds(22, 70, 227, 39);
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_2 = new JLabel("마일 계산!");
		JButton btnNewButton = new JButton("변환");
		
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(274, 78, 97, 23);
		getContentPane().add(btnNewButton);
		
		
		lblNewLabel_2.setBounds(47, 119, 202, 49);
		getContentPane().add(lblNewLabel_2);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SwitchMiletoKM().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String kiloMeter = textField.getText();
		double KiloMeterDouble = 0;
		
		KiloMeterDouble = Double.parseDouble(kiloMeter);
		
		KiloMeterDouble *= 1.609;
		lblNewLabel_2.setText(kiloMeter+"km는 " + KiloMeterDouble + "마일입니다.");
	}
}
