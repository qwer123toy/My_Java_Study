import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

// 학원 수강생 관리 프로그램
// 개설된 과정은 영어A반, 영어B반, 수학A반

// 학원 사정 상, 동명의 학생은 등록하지 못 한다.
// 한 학생은 여러 과정을 등록할 수 있다.
// 같은 과목에 같은 학생이 중복 등록하지 못 한다.
// 각 반은 총원이 3명 (총원이 가득찬 경우, 해당 과목의 반이 신규 개설된다)

// 모든 개설된 과정의 학생 목록을 확인할 수 있어야 한다.
// 특정 학생이 수강하는 과정 목록을 확인할 수 있어야 한다.

class Academy {
	TreeSet<String> students = new TreeSet<>();
	TreeMap<Integer, ArrayList<String>> engClass = new TreeMap<>();
	TreeMap<Integer, ArrayList<String>> mathClass = new TreeMap<>();

	public Academy() {
		super();
		this.engClass.put(1, new ArrayList<String>());
		this.engClass.put(2, new ArrayList<String>());
		this.mathClass.put(1, new ArrayList<String>());
	}

	public void showAllStudent() {
		System.out.println(students);
	}

	public void showEngStudent() {
		Collection<ArrayList<String>> engStudent = engClass.values();

		for (ArrayList<String> v : engStudent) {
			System.out.println(v.toString());
		}

	}

	public void findStudentSubjects(String student) {
		Collection<ArrayList<String>> engStudent = engClass.values();
		Collection<ArrayList<String>> mathStudent = mathClass.values();
		boolean engSubject = false;
		boolean mathSubject = false;
		for (ArrayList<String> v : engStudent) {
			if (v.contains(student)) {
				engSubject = true;
				System.out.println(student + " 학생은 영어과목을 듣는중");
			}
		}
		for (ArrayList<String> v : mathStudent) {
			if (v.contains(student)) {
				mathSubject = true;
				System.out.println(student + " 학생은 수학과목을 듣는중");
			}
		}

		if (engSubject == false && mathSubject == false)
			System.out.println("듣는 과목이 없습니다.");
	}

	public void registerAca(String student) {
		if (students.contains(student)) {
			System.out.println("이미 등록된 학생입니다.");
		} else {
			System.out.println(student + " 학생이 등록되었습니다.");
			students.add(student);
		}
	}

	public void registerEngClass(String student) {
		int key = 1;
		for (int i = 1; i < engClass.size(); i++) {
			if (engClass.get(i).contains(student)) {
				System.out.println("이미 해당 과목에 등록된 학생입니다.");
				return;
			} else if (!engClass.get(i).contains(student) && !students.contains(student)) {
				System.out.println("학원에 등록되지 않은 학생입니다.");
				return;
			}
		}

		if (engClass.get(engClass.size() - 1).size() == 3) {
			engClass.put(engClass.size() + 1, new ArrayList<String>());
			key = engClass.size() - 1;
		}
		
		for (int i = key; i < engClass.size(); i++) {

			if (engClass.get(i).size() < 3) {
				engClass.get(i).add(student);
				char classNum = (char) (i + 64);
				System.out.println("영어" + classNum + "반에 " + student + " 학생이 추가되었습니다.");
				return;
			}
		}
	}

	public void registerMathClass(String student) {
		int key = 1;
		for (int i = 1; i < mathClass.size(); i++) {
			if (mathClass.get(i).contains(student)) {
				System.out.println("이미 해당 과목에 등록된 학생입니다.");
				return;
			} else if (!mathClass.get(i).contains(student) && !students.contains(student)) {
				System.out.println("학원에 등록되지 않은 학생입니다.");
				return;
			}
		}

		if (mathClass.get(mathClass.size()).size() == 3) {
			mathClass.put(mathClass.size() + 1, new ArrayList<String>());
			key = mathClass.size();
		}
		for (int i = key; i < mathClass.size() + 1; i++) {

			if (mathClass.get(i).size() < 3) {
				mathClass.get(i).add(student);
				char classNum = (char) (i + 64);
				System.out.println("수학" + classNum + "반에 " + student + " 학생이 추가되었습니다.");
				return;
			}

		}
	}
}

public class Q {
	public static void main(String[] args) {
		Academy academy = new Academy();
		
		academy.registerAca("길동");
		academy.registerAca("미동");
		academy.registerAca("희동");
		academy.registerAca("치동");
		academy.registerAca("길동2");
		academy.registerAca("미동2");
		academy.registerAca("희동2");
		academy.registerAca("길동3");
		academy.registerAca("미동3");
		academy.registerAca("희동3");
		academy.registerEngClass("길동");
		academy.registerEngClass("미동");
		academy.registerEngClass("희동");
		academy.registerEngClass("치동");
		academy.registerEngClass("길동2");
		academy.registerEngClass("미동2");
		academy.registerEngClass("희동2");
		academy.registerEngClass("길동3");
		academy.registerEngClass("미동3");
		academy.registerEngClass("희동3");

		academy.registerMathClass("길동");
		academy.registerMathClass("미동");
		academy.registerMathClass("희동");
		academy.registerMathClass("치동");

		academy.registerMathClass("길동2");
		academy.registerMathClass("미동2");
		academy.registerMathClass("희동2");

		academy.showEngStudent();
//		academy.showAllStudent();
		academy.findStudentSubjects("길동");
		academy.findStudentSubjects("ㄷㄷ");

	}
}
