package Quiz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

class FallShit extends JLabel {
	private int x;
	private int y;

	public FallShit(int x, int y) {
		super();
		this.x = x;
		this.y = y;

		setBounds(x, y, 15, 15);
		setText("◆");
	}

	public void update() {
		y += 10;
		setBounds(x, y, 15, 15);
	}

}

public class Q2 extends JFrame {

	private List<FallShit> list;
	private JLabel lbl;
	private boolean pressLeft;
	private boolean pressRight;
	private JLabel resultLbl;
	private int count = 0;

	public Q2() {
		super("움직이는 요소");

		list = new ArrayList<>();
		URL resource = Q2.class.getResource("/image/abc.png");
		ImageIcon icon = new ImageIcon(resource);

		lbl = new JLabel(icon);
		resultLbl = new JLabel("점수 : " + count);
//	lbl = new JLabel("X");
		lbl.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		lbl.setBounds(200, 430, 30, 30);
		resultLbl.setBounds(0, 0, 100, 20);

		setLayout(null);
		add(lbl);
		add(resultLbl);

		setFocusable(true);
		requestFocus();

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				int result = JOptionPane.showOptionDialog(Q2.this, "Game Over", "확인", JOptionPane.CLOSED_OPTION,
						JOptionPane.QUESTION_MESSAGE, null, null, null);
				if (result == JOptionPane.YES_OPTION) {
					setDefaultCloseOperation(EXIT_ON_CLOSE);
				}
			}
		});

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					int x = (int) (Math.random() * 500);
					int y = 0;

					FallShit lblFire = new FallShit(x, y);

					list.add(lblFire);

					add(lblFire);

					// 컨테이너에 직접 호출을 해줘야됨
					revalidate();
					repaint();

				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//				movePlayerUp();
					pressLeft = true;

				} else if (keyCode == KeyEvent.VK_RIGHT) {
//				movingPlayerDown();
					pressRight = true;
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_LEFT) {
					pressLeft = false;

				} else if (keyCode == KeyEvent.VK_RIGHT) {
					pressRight = false;
				}

			}
		});

		Timer timer = new Timer(50, new ActionListener() {
			// 1000 -> 1초
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int x = (int) (Math.random() * 500);
				int y = 0;

				FallShit lblFire = new FallShit(x, y);

				list.add(lblFire);

				add(lblFire);

				for (FallShit m : list) {
					m.update();
					if (lbl.getX() < m.getX() && lbl.getX() + 30 > m.getX() && lbl.getY() < m.getY()
							&& lbl.getY() + 30 > m.getY()) {
						int input = JOptionPane.showConfirmDialog(Q2.this, "게임오버");
						System.out.println(input);
						if (input == 0) {
							System.exit(0);
						}

					}
				}

				if (!list.isEmpty()) {
					FallShit movingLabel = list.get(0);
					if (movingLabel.getY() >= Q2.this.getHeight()) {
						list.remove(0);
						remove(movingLabel);
						count++;
					}

				}
				
				resultLbl.setText("점수 : " + count);
//				if (lbl.getX() > list.get(0).getX() && lbl.getX() + 50 < list.get(0).getX()
//						&& lbl.getY() > list.get(0).getY() && lbl.getY() + 50 < list.get(0).getY()) {
//					 JOptionPane.showOptionDialog(Q.this, "정말로 창을 닫으시겠습니까", "확인",
//								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
//				}

				if (pressLeft) {
					movePlayerLeft();
				}
				if (pressRight) {
					movingPlayerRight();
				}
				revalidate();
				repaint();
			}

		});
		timer.start();

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private void movePlayerLeft() {
		int x = lbl.getX();
		int y = lbl.getY();
		int preX = x - 5;
		if (preX >= 0)
			lbl.setBounds(preX, y, 30, 30);
	}

	private void movingPlayerRight() {
		int x = lbl.getX();
		int y = lbl.getY();
		int preX = x + 5;
		if (preX <= getContentPane().getWidth() - lbl.getWidth())
			lbl.setBounds(preX, y, 30, 30);
	}

	public static void main(String[] args) {
		new Q2().setVisible(true);
	}
}
