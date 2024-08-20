package member;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TestPicture {
	public static void main(String[] args) {
		PictureDAO pictureDAO = new PictureDAO();
		Path path = Paths.get("C:\\Users\\GGG\\Pictures", "asdfzxcv.png");
//		try {
//			byte[] readAllBytes = Files.readAllBytes(path);
//			int row = pictureDAO.insert(path.getFileName().toString(), readAllBytes);
//			System.out.println("삽입된 행 개수 : " + row);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		byte[] data = pictureDAO.getData(1);
		ImageIcon icon = new ImageIcon(data);
		
		JOptionPane.showMessageDialog(null, "메시지","이미지 확인", JOptionPane.INFORMATION_MESSAGE, icon);
		
	}
}
