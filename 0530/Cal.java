import java.util.Scanner;

public class Cal {
 public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("- 상품 리스트 -");
	
	
	System.out.print("전달 받은 금액 입력 : ");
	int money = sc.nextInt();
	
	System.out.print("상품 가격 입력 : ");
	int price = sc.nextInt();
	
	System.out.println("거스름돈은 " + (money-price) + "원입니다.");
	

 }
}

