
import java.util.Scanner;


public class Q2 {
 public static void main(String[] args){
	
// 4. 사용자에게 5자리의 정수를 입력받아
// 역순으로 출력하는 프로그램

// 입력예) 12345 => 출력예) 54321
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Q4. 5자리 정수 입력 : ");
	int num = sc.nextInt();
	int num1 = num%10;
	int num2 = (num%100)/10;
	int num3 = (num%1000)/100;
	int num4 = (num%10000)/1000;
	int num5 = num/10000;
	int result = num5+num4*10+num3*100+num2*1000+num1*10000;
	System.out.printf("자리 바꿔서 출력 : %d \n\n",result);
	
	// String num1 = String.valueOf(num%10);
	// String num2 = String.valueOf((num%100)/10);
	// String num3 = String.valueOf((num%1000)/100);
	// String num4 = String.valueOf((num%10000)/1000);
	// String num5 = String.valueOf(num/10000);
	// System.out.println("자리 바꿔서 출력 : "+ num1+num2+num3+num4+num5);
	
	
	
	
// 5. 구의 반지름(정수)을 입력받아, 구의 부피를 구하는 프로그램
/*
	구의 부피 공식은 다음과 같습니다.
	4 / 3 x 반지름의 3제곱 x 파이(3.14)
*/

	System.out.print("Q5. 구의 반지름 입력 : ");
	double radius = sc.nextDouble();
	double volume = 4/3*radius*radius*radius*3.14;
	System.out.printf("구의 부피 : %.5f\n\n",volume);
	

// 6. 초단위의 시간을 입력받아
// # 시 # 분 # 초로 단위 환산하여 출력하는 프로그램
// 입력예) 3666 => 출력예) 1시간 1분 6초

	System.out.print("Q6. 초 입력 : ");
	int sec = sc.nextInt();
	int hour = sec/3600;
	sec = sec%3600;
	int min = sec/60;
	sec = sec%60;
	System.out.printf("시간: %d시간 %d분 %d초 \n",hour, min, sec);
	}
	
	
 }
 

