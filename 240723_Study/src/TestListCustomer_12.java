import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestListCustomer_12 {
	public static void main(String[] args) {
		File customerFile = new File("d:\\myFolder\\customer.txt");

		FileReader reader = null;
		StringBuilder sb = new StringBuilder();// 읽어온 문자열을 저장하기 위한 스트링빌더
		try {
			reader = new FileReader(customerFile);

			int ch;
			while ((ch = reader.read()) != -1) {// 문자 단위로 하나씩 파일에서 내용을 읽어옴
				System.out.println("읽은 문자 하나 : " + (char) ch);
				sb.append((char) ch);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null)
				try {
					reader.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
		}

		String fileContent = sb.toString();
		System.out.println(fileContent);
		
		// 개행문자를 기준으로 문자를 쪼갬
		String[] split = fileContent.split("\n"); 
		System.out.println(split[0]);
		System.out.println(split[1]);
	}
}
