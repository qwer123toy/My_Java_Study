package Quiz;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//1. 학생 정보를 입력받아, 다음과 같은 포맷의 정보로 저장하는 프로그램을 작성하세요
//한 번 실행 => 한 학생 콘솔 입력

//이름, 국어, 영어, 수학
//둘리, 100, 100, 100 // 사용자의 입력값
//도우너, 90, 90, 90
//길동, 80, 80, 80

//---

//1. Java에서 Windows File-System에 기록되어 있는 파일 경로를 나타낼 때, 경로 구분자 '문자'는? 
// - 역슬래시(\), 자바에서는 2개를 써줘야함(실제로는 1개)
//1-1. 상대적 경로를 나타내는 '.', '..', '\' 문자의 의미는 무엇인가요?
// - . 하나는 현재 경로, .. 두개는 부모 폴더 경로, \는 디렉토리 구분자로, 하위 디렉토리로 이동할 때 사용
//2. File 객체는 File-System에 꼭 존재해야만 생성가능한가요?
// - 존재하지 않아도 객체는 생성할 수 있음
// - 하지만 에러나 예외처리가 발생할 수 있으므로 exist() 메서드를 통해 확인해주는 것이 좋음
//3. File 객체로 Folder (Directory)를 접근할 수 있나요?
// - 가능함, 꼭 파일이 아니라 폴더도 File에 넣어둘 수 있음
// - 하지만 이것도 동일하게 존재하지 않아도 생성이 가능하므로 유의해서 접근할 것
// - 파일인지 폴더인지 isDirectory() 메서드를 이용하여 확인 가능
//4. File 객체로 실제 파일의 데이터 크기를 알아보는 방법과 단위는 무엇인가요?
// - File.length()를 통해 파일의 크기를 알아올 수 있으며, 이때 byte 단위로 불러옴 

//5. Input/Output Stream
//5-1. 입력 소스에서 데이터를 입력받는 흐름을 입력 스트림이라고 합니다.
//5-2. 출력 대상으로 데이터를 출력하는 흐름을 출력 스트림이라고 합니다.
//5-3. I/O Stream은 입출력하는 단위에 따라 Byte 스트림, Character 스트림으로 나뉩니다.
//5-4. 그렇다면 Text-File의 정보를 읽기 위해 적합한 형태의 스트림은 무엇인가요?
// - 정보를 직접 읽을 수 있는 Character 스트림이 더 적합함
// - Byte 스트림으로 불러올 경우 사용자가 명시적으로 확인 불가능
//5-5. 디스크 직접 접근은 비교적 비용이 많이 드는 작업입니다. 효율성을 크게 증가시키기 위해 사용할 수 있는 스트림은?
// - 버퍼를 사용하는 스트림을 사용하면 효율성이 크게 증가함(BufferedStream)
//5-6. I/O 스트림은 '순차적 접근'의 특징을 가집니다.
//5-7. I/O 스트림을 사용 후, 더 이상 필요하지 않는 스트림은 어떤 동작을 호출해야하나요?
// 더이상 사용하지 않는 스트림은 자원 해제를 해주어야함
// close() 메서드를 사용하여 스트림을 닫아주어야 메모리 누수를 방지할 수 있음

public class Q1 {
	public static void main(String[] args) {
		// 호텔의 예약을 하는 고객명과 전화번호를 파일로 기록하고자 함
		Scanner scanner = new Scanner(System.in);

		// 파일 객체 생성
		File studentFile = new File("d:\\myFolder\\Student.txt");
		FileWriter writer = null;
		BufferedReader br = null;

		try {

			// 해당 객체를 통해 실제로 해당 파일이 존재하는지 확인
			if (!studentFile.exists()) {
				writer = new FileWriter(studentFile);
				writer.write("이름");
				writer.write(", ");
				writer.write("국어");
				writer.write(", ");
				writer.write("영어");
				writer.write(", ");
				writer.write("수학");
				writer.write("\n");
			}

			else if (studentFile.length() != 0) {
				// 존재하지 않을 경우 파일을 생성하는데 이 때 "이름, 국어, 영어, 수학" 을 입력
				br = new BufferedReader(new FileReader(studentFile));

				String line = br.readLine();

				if (!line.equals("이름, 국어, 영어, 수학")) {
					writer = new FileWriter(studentFile);
					writer.write("이름");
					writer.write(", ");
					writer.write("국어");
					writer.write(", ");
					writer.write("영어");
					writer.write(", ");
					writer.write("수학");
					writer.write("\n");
				} else {
					// 이미 존재하고 있다면 윗부분에 해당하는 내용이 들어간 것이므로
					// 학생 정보를 입력 받아 파일에 출력
					writer = new FileWriter(studentFile, true);
					System.out.println("학생 이름은?");
					String name = scanner.nextLine();
					System.out.println("학생 국어 점수는?");
					int korScore = scanner.nextInt();
					System.out.println("학생 영어 점수는?");
					int engScore = scanner.nextInt();
					System.out.println("학생 수학 점수는?");
					int matScore = scanner.nextInt();

					// 구분 단위로 ", "를 입력해줌
					writer.write(name);
					writer.write(", ");
					writer.write(String.valueOf(korScore));
					writer.write(", ");
					writer.write(String.valueOf(engScore));
					writer.write(", ");
					writer.write(String.valueOf(matScore));
					writer.write("\n");

					System.out.println("파일에 학생 점수를 기록했습니다. 확인해보세요");
				}

			}

			else {
				System.out.println("이상한 짓 그만해");
			}

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
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
