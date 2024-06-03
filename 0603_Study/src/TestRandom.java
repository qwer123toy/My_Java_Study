import java.util.Random;
import java.util.Scanner;

public class TestRandom{
	public static void main(String[] args) {
		Random r = new Random();
		
		Scanner sc = new Scanner(System.in);
		int num = r.nextInt(10);
		
		System.out.print(num);

	}
}
