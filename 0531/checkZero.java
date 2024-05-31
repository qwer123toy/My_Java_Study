import java.util.Scanner;

public class checkZero {
 public static void main(String[] args) {
	
	System.out.print("숫자 2개 입력 : ");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int num2 = sc.nextInt();
	
	System.out.println(num+num2 == 0);
	
 }
}