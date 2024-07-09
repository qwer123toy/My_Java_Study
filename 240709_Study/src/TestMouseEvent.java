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
//				// System.out.println("��ư ���� ��");
//			}
//
//			@Override
//			public void mousePressed(MouseEvent e) {
//				// TODO Auto-generated method stub
//				// System.out.println("��ư ���� ��");
//
//				System.out.println("�̺�Ʈ �߻� ��ư" + e.getButton());
//				boolean leftClick = SwingUtilities.isLeftMouseButton(e);
//				boolean rightClick = SwingUtilities.isRightMouseButton(e);
//				System.out.println("���� ��ư�ΰ���?" + leftClick);
//				System.out.println("������ ��ư�ΰ���?" + rightClick);
//			}
//
//			@Override
//			public void mouseExited(MouseEvent e) {
//				// TODO Auto-generated method stub
//				//System.out.println("�гο��� ���콺�� ����");
//			}
//
//			@Override
//			public void mouseEntered(MouseEvent e) {
//				// TODO Auto-generated method stub
//				//System.out.println("�гο� ���콺�� ����");
//			}
//
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				// TODO Auto-generated method stub
//				// System.out.println("Ŭ���� ��");
//				
//				int clickCount = e.getClickCount();
//				if (clickCount == 2) {
//					System.out.println("���Ŭ��");
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
