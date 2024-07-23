import java.io.File;
import java.io.IOException;

public class TestFilePath_3 {
	public static void main(String[] args) {
		//복잡한 경로에 있는 파일은 어떻게 불러올 것인가?
		
		File file = new File("D:\\무현\\workspace\\240723_Study\\myfile.txt");
		
		//System.out.println(file.exists());
		
		File sameFile = new File(".\\myfile.txt");
//		System.out.println(sameFile.exists());
//		System.out.println(sameFile.getPath());
//		System.out.println(sameFile.getAbsolutePath());
//		
		try {
			System.out.println(sameFile.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
