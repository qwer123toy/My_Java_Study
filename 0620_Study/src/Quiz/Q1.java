package Quiz;

import java.util.Scanner;

//학생의 이름 국영수 입력 받음

// 학생 정보 확인 가능
//평균 점수 확인 가능
//모든 평균 점수

//학생수는 3명

public class Q1 {
	public static void main(String[] args) {
		StudentManagement sm = new StudentManagement();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("\n========================");
			System.out.println("학생 점수 관리 프로그램");
			System.out.printf("1. 학생 정보 입력(총원 %d명)\n", sm.stu.length);
			System.out.println("2. 학생 정보 확인");
			System.out.println("3. 학생 평균 점수 확인");
			System.out.println("4. 모든 학생 평균 점수 확인");
			System.out.println("5. 학생 추가");
			System.out.println("0. 종료");
			System.out.println("========================");
			System.out.print("입력 : ");
			String choose = sc.next();
			switch (choose) {
			case "1":
				sm.inputInfo();
				break;
			case "2":
				sm.showStudentInfo();
				break;
			case "3":
				sm.showStudentAvg();
				break;
			case "4":
				sm.showAllStudentAvg();
				break;
			case "5":
				sm.addStudent();
				break;
			case "0":
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}

		}
	}

}
