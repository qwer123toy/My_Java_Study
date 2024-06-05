import java.util.Random;
import java.util.Scanner;

/*
	8. for <-> while
*/
public class Q8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("미로 만들기 게임을 실시합니다.");
		System.out.println("미로 크기를 입력해주세요");
		System.out.println("ex) 3x4, 5x5");
		System.out.print("크기 입력 : ");
		int width = sc.nextInt();
		int lengh = sc.nextInt();
		int wall = 1;
		int way = 0;
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < lengh; j++) {
				// wall = r.nextInt(width);

				if ((i == 1 && j == 0) || i == width - 1 && j == lengh - 2) {
					//System.out.print(way);
					System.out.print("□ ");
				}
				// System.out.print("□ ");

				else if (i == 0 || i == width - 1 || j == 0 || j == lengh - 1)
					//System.out.print(wall);
					System.out.print("■ ");

				else {
					int obstacle = r.nextInt();
					if ((i == 1 && j == 1) || i == width - 2 && j == lengh - 2)
						//System.out.print(way);
						System.out.print("□ ");
					else if (obstacle % 5 == 0 || obstacle % 7 == 0)
						//System.out.print(wall);
						System.out.print("■ ");
					else {
						System.out.print("□ ");
						//System.out.print(way);
					}

				}

			}
			System.out.println();
		}
	}
}
