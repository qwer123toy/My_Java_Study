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

		URL resource = Q.class.getResource("/image/bullet.png");
		ImageIcon icon = new ImageIcon(resource);

		// JLabel lbl = new JLabel(icon);
		setIcon(icon);
		setBounds(x, y, 15, 15);
//		setText("◆");
	}

	public void update(int accelerator) {
		y += accelerator;
		setBounds(x, y, 15, 15);
	}

}

public class Q extends JFrame {

	private List<FallShit> list;
	private JLabel lbl;
	private boolean pressLeft;
	private boolean pressRight;
	private JLabel resultLbl;
	private int count = 0;
	private int accelerator = 5;

	public Q() {
		super("트럼프를 구해라");

		list = new ArrayList<>();
		URL resource = Q.class.getResource("/image/trump3.png");
		ImageIcon icon = new ImageIcon(resource);

		lbl = new JLabel(icon);
		resultLbl = new JLabel("점수 : " + count);
//	lbl = new JLabel("X");
//		lbl.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		lbl.setBounds(200, 430, 40, 40);
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
				int result = JOptionPane.showOptionDialog(Q.this, "Game Over", "확인", JOptionPane.CLOSED_OPTION,
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
				int input = -1;
				System.out.println(count);
				
				if ((count + 1) % 30 == 0) {
					accelerator++;
				}
				
				for (FallShit m : list) {
//					System.out.println(accelerator);
					
					m.update(accelerator);
//					if(lbl.getBounds().intersects(m.getBounds())) {
//						
//					}
					if (lbl.getX() < m.getX() && lbl.getX() + 30 > m.getX() && lbl.getY() < m.getY()
							&& lbl.getY() + 35 > m.getY()) {
						URL resource = Q.class.getResource("/image/biden.jpg");
						ImageIcon icon = new ImageIcon(resource);
						input = JOptionPane.showConfirmDialog(null, "트럼프가 죽었나요?", "종료", JOptionPane.YES_NO_OPTION,
								JOptionPane.QUESTION_MESSAGE, icon);
						if (input == 0) {
							System.exit(0);
						}
						if (input == 1) {
							break;
						}

					}
				}
				if (input == 1) {
					for (FallShit m2 : list) {
						remove(m2);
					}
					list.clear();
					count = 0;
					lbl.setBounds(200, 430, 40, 40);
					pressLeft = false;
					pressRight = false;
				}

				if (!list.isEmpty()) {
					FallShit movingLabel = list.get(0);
					if (movingLabel.getY() >= Q.this.getHeight()) {
						list.remove(0);
						remove(movingLabel);
						count++;
					}

				}

				resultLbl.setText("점수 : " + count);

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
			lbl.setLocation(preX, y);

	}

	private void movingPlayerRight() {
		int x = lbl.getX();
		int y = lbl.getY();
		int preX = x + 5;
		if (preX <= getContentPane().getWidth() - lbl.getWidth())
			lbl.setLocation(preX, y);
	}

	public static void main(String[] args) {
		new Q().setVisible(true);
	}
}
