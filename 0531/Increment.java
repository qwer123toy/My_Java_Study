
import java.util.Scanner;


public class Increment {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("숫자 입력 : ");
	int i = sc.nextInt();
	
	
	System.out.printf("%d %d %d %d %d", i-2, i-1, i, ++i, ++i );
	
 }
}