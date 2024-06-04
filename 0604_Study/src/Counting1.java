import java.util.Scanner;

//사용자에게 정수 5번 입력 받아
// 입력된 정수 중 음수의 개수 출력
public class Counting1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i = 0; // 반복문 5번을 돌리기 위한 변수
		int count = 0; // 조건에 합당한걸 찾았을 때 나올 개수

		while (i < 5) {//반복문 5회 실행
			System.out.print("정수 입력 : "); //스캐너로 5번 입력 받음
			int num = sc.nextInt(); // 입력 받은 수를 num에다가 넣음
			if (num < 0) { //num값이 음수인가?
				count++;//음수일 때는 count에다가 1을 더해줌
			}
			i++; // 반복문 5회를 위해 i에다가 1을 더해줌
		}
		System.out.println(count + "개");//최종 개수를 count로 출력
	}

}
