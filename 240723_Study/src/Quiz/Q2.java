package Quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//2. 위 파일의 정보를 읽어, 모든 점수의 합을 출력하는 프로그램

public class Q2 {
	public static void main(String[] args) {
		
		//파일 객체 생성
		File studentFile = new File("d:\\myFolder\\Student.txt");
		BufferedReader br = null; //버퍼리더를 사용
		String[] arr = null; // 한줄마다 넣어줄 스트링 배열 생성
		int sum = 0; //총합 계산을 위한 sum 생성
		int count = 0; // 첫번째 줄 이후에 값을 더해주기 위해 count 변수 생성
		try {
			br = new BufferedReader(new FileReader(studentFile));

			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				arr = line.split(", "); //입력받은 한줄을 스트링 배열에 넣어줌
				
				if (count > 0) {//첫줄을 통과하기 위한 조건문
					for (int i = 1; i < 4; i++) {//arr[1]~arr[3]까지의 값을 더해줌
						sum += Integer.parseInt(arr[i]); //String이므로 정수로 전환
					}
				}

				count++;//첫번째 줄을 판별하기 위해 count를 높여서 count가 1 이상일 때부터 위의 조건문을 실행
			}

			System.out.println("입력된 학생들의 총 합계 : " + sum + "점입니다.");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null)
				try {
					br.close();

				} catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
}
