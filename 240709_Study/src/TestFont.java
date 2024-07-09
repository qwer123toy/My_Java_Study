import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

class MyFontHolder {
	private Font myFont;
	
	public MyFontHolder() {
		try {
			myFont = Font.createFont(Font.TRUETYPE_FONT
					, TestFont.class.getResourceAsStream("/fonts/NanumPenScript-Regular.ttf"));
		} catch (FontFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Font getDeriveFont(int style, float size) {
		return myFont.deriveFont(style, size);
	}
}

public class TestFont extends JFrame implements ActionListener {
	private JTextField tfName;
	private JLabel lblResult;
	private JButton btnConfirm;
	private Font myFont;
	private MyFontHolder myFontHolder;
	
	public TestFont() {
		super("텍스트의 폰트 설정");
		myFontHolder = new MyFontHolder();
		
		JLabel lbl = new JLabel("로렘 입숨");
		lbl.setFont(myFontHolder.getDeriveFont(Font.PLAIN, 24));
		JPanel pnl = new JPanel();
		JLabel lbl2 = new JLabel("다른거");
		lbl2.setFont(myFontHolder.getDeriveFont(Font.BOLD, 32));
		
		pnl.add(lbl);
		pnl.add(lbl2);
		add(pnl);
		
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	

	public static void main(String[] args) {
		new TestFont().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input = tfName.getText();
		System.out.println("사용자 입력 값 : " + input);
		lblResult.setText(input);
	}
}
