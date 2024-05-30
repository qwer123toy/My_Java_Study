import java.util.Scanner;

public class Score {
 public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	
	
	System.out.print("국어 : ");
	int kor = sc.nextInt();
	System.out.print("영어 : ");
	int eng = sc.nextInt();
	System.out.print("수학 : ");
	int mat = sc.nextInt();
	
	int sum = kor+eng+mat;
	double avg = (double)sum/3;
	
	System.out.println("총점 :  " + sum);
	System.out.println("평균 :  " + avg);
	

 }
}

