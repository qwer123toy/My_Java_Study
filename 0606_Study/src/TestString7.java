import java.util.Random;
import java.util.Scanner;

// 사용자 입력한 한줄에
// o 문자가 몇번째에 있는지 알려주는 프로그램

public class TestString7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");

		String line = sc.nextLine();
		int count=0;
		
		for (int i = 0; i < line.length(); i++) {
			if(line.charAt(i)=='o')
				System.out.printf("o의 위치 %d번째입니다.\n",i+1);
		}
		//System.out.printf("b의 개수는 %d입니다.",count);
	}
}
