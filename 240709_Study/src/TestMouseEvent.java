import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class TestMouseEvent extends JFrame implements ActionListener {

	public TestMouseEvent() {
		super("Mouse Event");

		JPanel pnl = new JPanel();
		
		pnl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
			}
		});

//		pnl.addMouseListener(new MouseListener() {
//
//			@Override
//			public void mouseReleased(MouseEvent e) {
//				// TODO Auto-generated method stub
//				// System.out.println("버튼 놓을 때");
//			}
//
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//				// System.out.println("버튼 누를 때");
//
//				System.out.println("이벤트 발생 버튼" + e.getButton());
//				boolean leftClick = SwingUtilities.isLeftMouseButton(e);
//				boolean rightClick = SwingUtilities.isRightMouseButton(e);
//				System.out.println("왼쪽 버튼인가요?" + leftClick);
//				System.out.println("오른쪽 버튼인가요?" + rightClick);
//			}
//
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//				//System.out.println("패널에서 마우스가 나감");
//			}
//
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub
//				//System.out.println("패널에 마우스가 들어옴");
//			}
//
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub
//				// System.out.println("클릭할 때");
//				
//				int clickCount = e.getClickCount();
//				if (clickCount == 2) {
//					System.out.println("드블클릭");
//				}
//			}
//		});
		add(pnl);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new TestMouseEvent().setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
