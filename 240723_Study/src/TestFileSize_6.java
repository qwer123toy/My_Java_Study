import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFileSize_6 {
	public static void main(String[] args) {
		File file = new File("d:\\myfolder\\new.txt");

//		System.out.println(file.length()); //파일의 길이를 받아옴

		// try 밖에서 선언
		// 하지만 초기화를 하지 않았기 때문에 에러 발생
		// null로 초기화를 해줌

		Scanner scanner = null;
		try {
			scanner = new Scanner(file);
			// scanner의 자원해제가 필요함
			// OS는 사용 중인 파일을 다른 파일이 훼손하지 못하게 접근을 막음
			// Scanner가 자원을 붙들고 있기 때문에 OS는 이 파일이 계속 사용 중이라고 판단하고
			// 다른 파일에서 접근을 못하게 막음

			// 다음 줄이 있는지 확인
			while (scanner.hasNextLine()) {
				String nextLine = scanner.nextLine();
				System.out.println("파일에 기록된 문자열 한줄 : " + nextLine);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일이 존재하지 않음");
		} finally {

			// 하지만 예외가 발생할 수 있음
			// 자원 해제
			// scanner의 선언 영역은 try 안이기 때문에 finally에서 접근 불가능
			// 하지만 만약 아무것도 파일이 없다면 null 참조 에러가 발생함
			// 고로 null이 아닐 때 close를 실행
			if (scanner != null)
				scanner.close();
		}
	}
}
