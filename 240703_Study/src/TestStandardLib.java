import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class TestStandardLib {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		Random r1 = new Random(100);
		Random r2 = new Random(100);
		
		System.out.println(sc1.equals(sc2));
		System.out.println(r1.equals(r2));
		System.out.println(Objects.equals(sc1, sc2));
	}
}
