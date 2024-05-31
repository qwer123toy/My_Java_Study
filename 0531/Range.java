import java.util.Scanner;

public class Range {
 public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int num = sc.nextInt();

	System.out.println(0 <= num && num <= 100);
	
 }
}
