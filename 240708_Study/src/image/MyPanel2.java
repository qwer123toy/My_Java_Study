package image;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class MyPanel2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public MyPanel2() {
		setPreferredSize(new Dimension(581, 405));

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(36, 10, 468, 365);

		// 아이콘 객체를 만들어옴
		// 이미지를 전달하거나 URL 주소를 가져오는 등의 방법 존재(아이콘 객체를 만들 때)
		// URL(자원의 위치를 나타냄) 위치는 클래스이름.class.getResource("파일 있는 주소")
		lblNewLabel.setIcon(new ImageIcon(MyPanel2.class.getResource("/image/춘식3.gif")));

		// 이미지 객체는 단순 생성 불가능(추상 클래스이기 때문)
		// 추상클래스를 이용하여 생성하기 위한 도구가 필요함(Toolkit)
		// Toolkit의 이미지를 반환하는 메소드를 이용하여 생성가능

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		Image choonsik3 = toolkit.createImage(MyPanel2.class.getResource("/image/춘식3.gif"));

		Image choonsik2 = toolkit.getImage(MyPanel2.class.getResource("/image/춘식3.gif"));

		JLabel lblNewLabel2 = new JLabel("  ");

		//버퍼에서 읽어온 이미지를 통해 이미지를 생성
		BufferedImage choonsik = null;

		try {
			choonsik = ImageIO.read(MyPanel2.class.getResource("/image/춘식3.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblNewLabel2.setIcon(new ImageIcon(choonsik2));

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(MyPanel2.class.getResource("/image/춘식11.png")));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});
		add(lblNewLabel2);
		add(btnNewButton);

	}

}
