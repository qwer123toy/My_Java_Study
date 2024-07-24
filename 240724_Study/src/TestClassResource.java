import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;

public class TestClassResource {
	public static void main(String[] args) {
		// File file = new
		// File("D:\\무현\\workspace\\240724_Study\\resource\\admin2.txt");
		// 절대 경로가 아닌 class loader를 사용

		File file = null;
		try {
			file = new File(TestClassResource.class.getResource("/resource/admin2.txt").toURI());
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(file));

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println("확인된 관리자명 : " + line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
	}
}
