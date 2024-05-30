
import java.util.Scanner;

public class Q1 {
 public static void main(String[] args){
	
// 1. 사용자의 체중(정수 kg 단위)을 입력받아
// 일일 권장 단백질 섭취량을 계산해 출력하는 프로그램
// (일일 권장 단백질은 1kg 당 0.8 ~ 1.5g 입니다.)

// 입력예) 72 => 출력예) 57.6 ~ 108.0 gram	

	Scanner sc = new Scanner(System.in);
	System.out.print("Q1. 체중 입력 : ");
	int weight = sc.nextInt();
	double recomMin = (double)weight*0.8;
	double recomMax = (double)weight*1.5;
	
	System.out.printf("권장 단백질 양 :%.1fg ~ %.1fg\n\n",recomMin, recomMax);
	
// 2. 사과가 여러개 있을 때, 포장을 하려고 합니다.
// 한 상자에 들어갈 수 있는 개수와 총 사과 개수를 입력받고
// 필요한 사과 박스 개수와, 상자를 채우지 못해 포장이 되지않는 사과 개수를 출력

// 입력예)
// 박스 : 10
// 총사과 : 65
// 출력예) 포장된 사과 박스 : 6개, 포장되지 않은 사과 개수 : 5개
	
	System.out.print("Q2. 박스 개수 : ");
	int boxApple = sc.nextInt();
	System.out.print("총 사과 개수 : ");
	int allApple = sc.nextInt();
	int box = allApple/boxApple;
	int modApple = allApple%boxApple;
	System.out.printf("포장된 사과 박스 : %d개, 포장되지 않은 사과 개수 : %d개\n\n",box,modApple);
	

// 단위 환산 프로그램
// 키를 cm 단위(정수)로 입력받아
// x ft x inch 형태로 출력하기 (1ft = 12inch, 1inch = 2.54cm)
	

	System.out.print("Q3. 키 입력 : ");
	int height = sc.nextInt();
	double inch = (double)height/2.54;
	double ft = inch/12;
	
	System.out.printf("키 변환 : %dcm는 %.2f ft, %.2f inch입니다.",height,ft,inch);
	}
	
}

