import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TestFileRead2_8 {
	public static void main(String[] args) {
		File file = new File("d:\\myfolder\\new.txt");
		
		FileInputStream inputStream = null;
		//파일을 읽을 때 Byte 단위로 읽음
		//FileReader는 문자 단위로 읽음
		
		try {
			inputStream = new FileInputStream(file);
			
			int ch;
			while ( (ch = inputStream.read()) != -1 ) {
				System.out.print((char)ch);
			}
			while(true) {
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어서 예외 발생");
		} catch (IOException e) {
			System.out.println("파일을 읽는 중 예외 발생");
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					System.out.println("자원 해제 중, 예외 발생");
				}
			}
		}
	}
}
