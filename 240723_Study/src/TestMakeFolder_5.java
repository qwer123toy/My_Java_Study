import java.io.File;
import java.io.IOException;

public class TestMakeFolder_5 {
	public static void main(String[] args) {
		
		//만들어놓은 폴더에 뭘 하고 싶음
		File dataFolder = new File("d:\\myfolder");
		
		File helloFolder = new File(dataFolder,"hello");
		System.out.println(helloFolder.getPath());//주소는 나오지만
		System.out.println(helloFolder.exists());//존재 하지 않음
		
		//폴더 생성
		helloFolder.mkdir(); // helloFolder 객체에 들어가있는 정보를 토대로 폴더 생성
		boolean exists = helloFolder.exists(); 
		if(exists) { //helloFolder가 존재할 때만
			File file = new File(helloFolder, "world.txt");
			// helloFolder를 부모 폴더로 갖고 있는 world.txt 파일 객체 생성
			
			if(!file.exists()) {
				try {
					file.createNewFile(); // 해당 객체 정보를 기반으로 하는 파일을 실제로 생성
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
