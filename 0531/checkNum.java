import java.util.Scanner;

public class checkNum {
 public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int num = sc.nextInt();
	int num2 = sc.nextInt();

	System.out.println(num > num2 && num % num2 == 0 && num > 0 && num2 > 0);
	
 }
}
