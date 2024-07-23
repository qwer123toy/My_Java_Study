import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream_10 {
	public static void main(String[] args) {
		int score = 180;
		File scoreFile = new File("d:\\myFolder\\score.bin");

		FileOutputStream output = null;
		try {
			output = new FileOutputStream(scoreFile);
			
			output.write(score);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(scoreFile);
			int value = fis.read();
			System.out.println("파일에서 읽은 정수 값 : " + value);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
