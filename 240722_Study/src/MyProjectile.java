import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

class MovingLabel extends JLabel {
	private int x;
	private int y;

	public MovingLabel(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		
//		URL resource = MyProjectile.class.getResource("/image/abc.png");
//		ImageIcon icon = new ImageIcon(resource);
//
//		JLabel lbl = new JLabel(icon);
//		setIcon(icon);
		setBounds(x, y, 70, 50);
		setText("-");
	}

	public void update() {
		x +=1;
		setBounds(x, y, 70, 50);
	}

}

public class MyProjectile extends JFrame {

	private List<MovingLabel> list;
	int y = 50;
	private JLabel lbl;
	private boolean pressUp;
	private boolean pressDown;

	public MyProjectile() {
		super("움직이는 요소");

		list = new ArrayList<>();
		URL resource = MyProjectile.class.getResource("/image/abc.png");
		ImageIcon icon = new ImageIcon(resource);
		
		lbl = new JLabel(icon);

//		lbl = new JLabel("X");
		lbl.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		lbl.setBounds(50, y, 50, 50);

		setLayout(null);
		add(lbl);

		setFocusable(true);
		requestFocus();

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (e.getKeyCode() == KeyEvent.VK_SPACE) {
					int x = lbl.getX() + lbl.getWidth();
					int y = lbl.getY();
					
					MovingLabel lblFire = new MovingLabel(x, y);

					list.add(lblFire);

					add(lblFire);

					// 컨테이너에 직접 호출을 해줘야됨
					revalidate();
					repaint();

				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
//					movePlayerUp();
					pressUp = true;

				} else if (keyCode == KeyEvent.VK_DOWN) {
//					movingPlayerDown();
					pressDown = true;
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_UP) {
					pressUp = false;

				} else if (keyCode == KeyEvent.VK_DOWN) {
					pressDown = false;
				}

			}
		});

		Timer timer = new Timer(1, new ActionListener() {
			//1000 -> 1초
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (MovingLabel m : list)
					m.update();

				if (!list.isEmpty()) {
					MovingLabel movingLabel = list.get(0);
					if (movingLabel.getX() >= MyProjectile.this.getWidth()) {
						list.remove(0);
						remove(movingLabel);
					}

				}
				
				if(pressUp) {
					movePlayerUp();
				}
				if(pressDown) {
					movingPlayerDown();
				}
				revalidate();
				repaint();
			}

		});
		timer.start();

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new MyProjectile().setVisible(true);
	}

	private void movePlayerUp() {
		int x = lbl.getX();
		int y = lbl.getY();
		int preY = y - 5;
		if (preY >= 0)
			lbl.setBounds(x, preY, 50, 50);
	}
	

	private void movingPlayerDown() {
		int x = lbl.getX();
		int y = lbl.getY();
		int preY = y + 5;
		if (preY <= getContentPane().getHeight() - lbl.getHeight())
			lbl.setBounds(x, preY, 50, 50);
	}
}
