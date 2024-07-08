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

		// ������ ��ü�� ������
		// �̹����� �����ϰų� URL �ּҸ� �������� ���� ��� ����(������ ��ü�� ���� ��)
		// URL(�ڿ��� ��ġ�� ��Ÿ��) ��ġ�� Ŭ�����̸�.class.getResource("���� �ִ� �ּ�")
		lblNewLabel.setIcon(new ImageIcon(MyPanel2.class.getResource("/image/���3.gif")));

		// �̹��� ��ü�� �ܼ� ���� �Ұ���(�߻� Ŭ�����̱� ����)
		// �߻�Ŭ������ �̿��Ͽ� �����ϱ� ���� ������ �ʿ���(Toolkit)
		// Toolkit�� �̹����� ��ȯ�ϴ� �޼ҵ带 �̿��Ͽ� ��������

		Toolkit toolkit = Toolkit.getDefaultToolkit();

		Image choonsik3 = toolkit.createImage(MyPanel2.class.getResource("/image/���3.gif"));

		Image choonsik2 = toolkit.getImage(MyPanel2.class.getResource("/image/���3.gif"));

		JLabel lblNewLabel2 = new JLabel("  ");

		//���ۿ��� �о�� �̹����� ���� �̹����� ����
		BufferedImage choonsik = null;

		try {
			choonsik = ImageIO.read(MyPanel2.class.getResource("/image/���3.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lblNewLabel2.setIcon(new ImageIcon(choonsik2));

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(MyPanel2.class.getResource("/image/���11.png")));
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
