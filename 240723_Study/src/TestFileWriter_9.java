import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter_9 {
	public static void main(String[] args) {
		File file = new File("d:\\myFolder\\datalog.txt");

		// while 문을 통해 접근하거나 미리 캐릭터형 배열로 만들어 놓을 수 있음
		String topScore = "오늘 최고 기록: 190점";

		// 문자 하나씩 넣은 캐릭터형 배열 생성
		char[] arr = topScore.toCharArray();

		// 문자 단위 출력 스트림
		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
//			for (int i = 0; i < arr.length; i++) {
//				// writer 객체가 들고 있는 write 메소드를 통해 출력
//				writer.write(arr[i]);
//			}
			writer.write(arr, 0, arr.length); //반복문 없이도 write 메서드를 이용해 알아서 출력함
			writer.write(arr);//캐릭터형 배열을 바로 출력도 가능
			writer.write(topScore);//String에도 바로 접근하여 출력 가능

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
