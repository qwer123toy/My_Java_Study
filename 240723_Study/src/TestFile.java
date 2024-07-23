import java.io.File;

public class TestFile {
	public static void main(String[] args) {
		
		//파일은 경로를 가짐
		//백슬러시(\)를 경로 구분자로 사용 
		
		//절대경로
		File file = new File("d:\\hello.txt");
		System.out.println(file.exists());
//		//파일이 존재하는지 확인
//		
//		System.out.println("파일 이름 : " + file.getName());
//		System.out.println("파일 경로 : " + file.getPath());
		
		
		System.out.println("폴더인가요?" + file.isDirectory());
		
		
		
		File directory = new File("d:\\myFolder");	
		System.out.println("폴더인가요?" + directory.isDirectory());
		
		System.out.println("파일 이름 : " + directory.getName());
		System.out.println("파일 경로 : " + directory.getPath());
		File another = new File("d:\\myFolder\\hello2.txt");
		//System.out.println(another.exists());
		
	}
}
