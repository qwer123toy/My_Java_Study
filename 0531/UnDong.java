import java.util.Scanner;

public class UnDong {
 public static void main(String[] args) {
	 
	Scanner sc = new Scanner(System.in);
	System.out.print("벤치 중량 입력 : ");
	int bench = sc.nextInt();
	
	System.out.print("스쿼트 중량 입력 : ");
	int squart = sc.nextInt();
	
	System.out.print("데드리프트 중량 입력 : ");
	int dead = sc.nextInt();
	System.out.println(bench + squart + dead);
	System.out.println(bench + squart + dead >= 500);
	
 }
}
