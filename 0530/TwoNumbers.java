import java.util.Scanner;

public class TwoNumbers {
 public static void main(String[] args){
	
	System.out.println("시작");
	Scanner sc = new Scanner(System.in);
	
	System.out.print("입력 : ");
	int num = sc.nextInt();
	System.out.print("다음 : ");
	int num2 = sc.nextInt();
	char aa = '와';
	
	if(num%10==1 || num%10==3 || num%10==6 || num%10==7 ||num%10==8)
	{
		aa = '과';
	}
	else{
		aa = '와';
	}
	System.out.println("입력값은 " + num + aa + num2 + "입니다.");
	

 }
}

