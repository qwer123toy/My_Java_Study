import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestWriteCustomerInfo_11 {
	public static void main(String[] args) {
		// 호텔의 예약을 하는 고객명과 전화번호를 파일로 기록하고자 함
		Scanner scanner = new Scanner(System.in);
		System.out.println("고객 이름은?");
		String name = scanner.nextLine();
		System.out.println("고객 전화번호는?");
		String phoneNumber = scanner.nextLine();
		
		File customerFile = new File("d:\\myFolder\\customer.txt");
		FileWriter writer = null;
		try {
			//새롭게 파일을 추가하는 것이 아닌 기존 내용에서 추가로 붙여줌
			writer = new FileWriter(customerFile, true);
			
			//입력을 구분하기 위한 개행문자 삽입
			writer.write(name);
			writer.write("\n");
			writer.write(phoneNumber);
			writer.write("\n");
			
			System.out.println("파일에 고객 정보를 기록했습니다. 확인해보세요");
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

