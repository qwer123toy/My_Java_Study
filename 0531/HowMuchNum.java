import java.util.Scanner;

public class HowMuchNum {
 public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 3개 입력 : ");
	int num = sc.nextInt();
	int num2 = sc.nextInt();
	int num3 = sc.nextInt();
	
	boolean check = num < num2 && (num2-num)==(num3-num2);
	
	System.out.println(check);
	
 }
}
