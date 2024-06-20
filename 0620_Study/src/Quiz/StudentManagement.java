package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManagement {

	// 초기에는 길이 3에 기본값을 가진 배열로 선언
	Student[] stu = new Student[3];

	Scanner sc = new Scanner(System.in);

	public StudentManagement() {
	}

	public StudentManagement(Student[] stu) {
		super();
		this.stu = stu;
	}

	public Student[] getStu() {
		return stu;
	}

	public void setStu(Student[] stu) {
		this.stu = stu;
	}

	public void inputInfo() {
		for (int i = 0; i < stu.length; i++) {
			// stu가 비어있을 경우에만 입력
			if (stu[i] == null) {
				// 입력 가능 인원을 보여줌
				System.out.println("\n========================");
				System.out.printf("학생의 이름을 입력하세요(현재 입력 가능한 인원 %d/%d명\n", stu.length - i, stu.length);
				System.out.print("입력 : ");

				String name = sc.next();
				System.out.println("학생의 국어 성적을 입력하세요");
				System.out.print("입력 : ");
				int kor = sc.nextInt();
				System.out.println("학생의 수학 성적을 입력하세요");
				System.out.print("입력 : ");
				int mat = sc.nextInt();
				System.out.println("학생의 영어 성적을 입력하세요");
				System.out.print("입력 : ");
				int eng = sc.nextInt();

				// 입력한 값을 Student 객체를 하나 생성하여 stu에 입력
				Student s = new Student(name, kor, mat, eng);
				stu[i] = s;
				return;
			}
		}
		// stu 배열에 null값이 없을 경우
		System.out.println("추가 입력할 공간이 부족합니다.");
	}

	public void showStudentInfo() {
		System.out.println("\n========================");
		System.out.println("학생의 이름을 입력하세요.");
		System.out.print("입력 : ");
		String studentName = sc.next();
		int count = 0;
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {// stu배열이 null이 아닌 경우에만 접근, 만약 null일 때 접근 시 에러 발생
				if (stu[i].getName().equals(studentName)) { // 입력 받은 값과 해당 배열의 name 변수가 같은지 확인
					System.out.println("\n========================");
					System.out.println("학생 이름 : " + stu[i].getName());
					System.out.println("국어 점수 : " + stu[i].getKor());
					System.out.println("수학 점수 : " + stu[i].getMat());
					System.out.println("영어 점수 : " + stu[i].getEng());
					System.out.println("========================\n");
					// return; 찾았을 때 출력 후 반복문 탈출
					count++; // 이름이 동일한 학생들을 모두 출력하기 위해 return이 아닌 count로 변경
				}
			}
		}
		if (count == 0) // count에 변동이 없을 시
			System.out.println("해당 하는 학생이 없습니다.");
	}

	public void showStudentAvg() {
		System.out.println("\n========================");
		System.out.println("학생의 이름을 입력하세요.");
		System.out.print("입력 : ");
		String studentName = sc.next();
		int count = 0;
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {// 배열이 null이 아닐때만 확인
				if (stu[i].getName().equals(studentName)) {
					System.out.println("\n========================");
					System.out.println("학생 이름 : " + stu[i].getName());
					System.out.printf("평균 점수 : %.2f\n",
							(double) (((stu[i].getKor()) + stu[i].getMat()) + stu[i].getEng()) / 3.0);
					System.out.println("========================\n");
					// return;
					count++;
				}
			}
		}
		if (count == 0)
			System.out.println("해당 하는 학생이 없습니다.");
	}

	public void showAllStudentAvg() {

		int sum = 0; // 평균을 구하기 위한 합계
		int count = 0; // 입력한 학생 수를 계산하기 위한 변수
		for (int i = 0; i < stu.length; i++) {
			if (stu[i] != null) {// 배열이 null이 아닐때 갖고있는 점수들을 sum에다가 더해줌
				sum += stu[i].getEng();
				sum += stu[i].getKor();
				sum += stu[i].getMat();
				count++;// 한번이라도 실행되었는지 확인하기 위해 ++을 해줌
			}
		}
		if (count > 0) {// 한번이라도 실행 시 학생 점수가 입력이 된 것이므로 평균을 출력
			double avg = (double) sum / (count * stu.length);
			System.out.printf("전체 학생 인원은 %d명, 총점은 %d점니다.\n", count, sum);
			System.out.printf("전체 학생 평균 점수는 %.2f점입니다.\n", avg);
		} else {
			System.out.println("입력된 학생이 없습니다.");
		}
	}

	public void addStudent() {
		System.out.println("몇 명의 학생을 추가하겠습니까?");
		System.out.print("입력 : ");
		int num = sc.nextInt();
		if (num > 0) {
			Student[] copy = Arrays.copyOf(stu, stu.length + num); // 입력 받은 학생 수만큼의 크기를 늘리고 내용을 복사한 배열을 하나 만듬
			stu = copy; // 새로만든 copy 참조변수를 stu 참조변수에 덮어씌워 내용은 동일하고 크기가 변경된 새로운 배열을 가리키게 변경
			System.out.printf("%d명의 학생이 추가되어 총 학생 인원이 %d명으로 변경되었습니다.\n", num, stu.length);
		} else {
			System.out.println("1명 이상으로 입력하세요.");
		}
	}
}
