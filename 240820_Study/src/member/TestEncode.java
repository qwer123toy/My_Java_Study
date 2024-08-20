package member;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TestEncode {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\GGG\\Pictures", "그림2.png");

		try {
			byte[] readAllBytes = Files.readAllBytes(path);
			
			Encoder encoder = Base64.getEncoder();
			String code = encoder.encodeToString(readAllBytes);
			
			Base64DAO base64 = new Base64DAO();
			base64.insert("춘식4.png", code);
//			System.out.println(code);
			
			Decoder decoder = Base64.getDecoder();
			byte[] decode = decoder.decode(code);
			
			ImageIcon icon = new ImageIcon(decode);
			
			JOptionPane.showMessageDialog(null, "메시지","이미지 확인", JOptionPane.INFORMATION_MESSAGE, icon);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
