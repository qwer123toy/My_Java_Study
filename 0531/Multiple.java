import java.util.Scanner;

public class Multiple {
 public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int num = sc.nextInt();

	System.out.println(100 <= num && num < 200 && num % 3 == 0);
	
 }
}
