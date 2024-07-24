package Quiz;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

// GUI 프로그램에서
// 사용자가 배경색을 지정할 수 있고
// 선택한 배경색을 '환경설정 파일'로 저장하여
// 프로그램 재실행 시, 설정한 배경색이 표현되는 프로그램

public class Q2 extends JFrame {
	public Q2() {
		super("배경색 지정");

		JButton btn = new JButton("색깔 선택");
		add(btn, "North");

		File colorFile = new File("d:\\myFolder\\color.txt");
		BufferedReader colorReader = null;
		try {
			if (colorFile.exists()) {
				colorReader = new BufferedReader(new FileReader(colorFile));
				String line;
				StringBuilder sb = new StringBuilder();
				while ((line = colorReader.readLine()) != null) {
					sb.append(line);
				}

				String result = sb.toString();
				String[] colorArr = result.split(",");
				int red = Integer.parseInt(colorArr[0]);
				int green = Integer.parseInt(colorArr[1]);
				int blue = Integer.parseInt(colorArr[2]);
//				System.out.println(red);
//				System.out.println(green);
//				System.out.println(blue);
				Color color = new Color(red, green, blue);
				getContentPane().setBackground(color);
			}

		} catch (FileNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (colorReader != null)
				try {
					colorReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				FileWriter colorWriter = null;

				try {
					Color color = JColorChooser.showDialog(Q2.this, "배경색 선택", Color.WHITE);
					colorWriter = new FileWriter(colorFile);
					int red = color.getRed();
					int green = color.getGreen();
					int blue = color.getBlue();
					colorWriter.write(String.valueOf(red));
					colorWriter.write(",");
					colorWriter.write(String.valueOf(green));
					colorWriter.write(",");
					colorWriter.write(String.valueOf(blue));

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {

					if (colorWriter != null)
						try {
							colorWriter.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}

			}
		});

		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Q2().setVisible(true);
	}

}
