import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileRead_7 {
	public static void main(String[] args) {
		File file = new File("d:\\myfolder\\new.txt");
		
		FileReader reader = null;
		//Char 단위의 문자 단위로 파일을 읽어옴
		//파일을 읽는 단위가 scanner와 다름

		//데이터의 흐름을 스트림이라고 부름
		//현재 폴더의 파일을 코드로 가져오고 있기 때문에 이 때 생기는 데이터 흐름을 InputStream이라고 부름
		try {
			reader = new FileReader(file);
			
			int ch;
			while ( (ch = reader.read()) != -1 ) {
				System.out.print((char)ch);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없어서 예외 발생");
		} catch (IOException e) {
			System.out.println("파일을 읽는 중 예외 발생");
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					System.out.println("자원 해제 중, 예외 발생");
				}
			}
		}
	}
}
