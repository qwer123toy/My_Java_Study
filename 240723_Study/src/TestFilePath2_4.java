import java.io.File;
import java.io.IOException;

public class TestFilePath2_4 {
	public static void main(String[] args) {
		
//		File file = new File("D:\\무현\\workspace\\240723_Study\\myfile.txt");
//		
//		System.out.println("부모 경로 명 : " + file.getParent());
//		File parent = file.getParentFile();
//		System.out.println(parent.getPath());
//		
//		File workspace = parent.getParentFile();
//		System.out.println(workspace.getParent());
//		
		//상대 경로 상위(부모) 경로
		File currentFolder = new File("."); //현재 경로
		File parentFolder = new File(".."); //상위 경로
		
		try {
			System.out.println("상위 경로의 절대 경로 : " + parentFolder.getCanonicalPath());
			System.out.println("현재 경로의 절대 경로 : " + currentFolder.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File parentparentFolder = new File("..\\.."); //상위 경로의 상위경로
		
	}
}
