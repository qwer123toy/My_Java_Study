import java.io.File;

public class TestAbsFile_2 {
	public static void main(String[] args) {

		File file = new File("없는 드라이브:\\없는 폴더\\ 없는 파일.없는 확장자");
		// 실제로 존재하지 않아도 파일 객체로 불러올 수 있기 때문에
		// 존재여부를 먼저 판단해주는 것이 안전함
		System.out.println(file.exists());

	}
}
