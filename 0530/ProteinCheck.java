import java.util.Scanner;

public class ProteinCheck {
 public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("체중 입력 : ");
	int weight = sc.nextInt();
	double recomMin = (double)weight*0.8;
	double recomMax = (double)weight*1.5;
	
	System.out.printf("권장 단백질 양 :%.1fg ~ %.1fg",recomMin, recomMax);
	
	}
	
}