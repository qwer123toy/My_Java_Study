import java.util.Scanner;

public class checkOdd {
 public static void main(String[] args) {
	
	System.out.print("숫자 입력 : ");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	System.out.println(num%2 == 0 && num > 0);
	
 }
}