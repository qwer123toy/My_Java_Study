import java.util.Scanner;

public class Temple {
	int healCount = 3;
	
	public void fullHeal(HeroStat h) {
		System.out.println("◎회복의 신전에 오신 것을 환영합니다◎");
		System.out.printf("총 3회 중 %d회 이용하실 수 있습니다.\n", healCount);
		System.out.println("1. 회복  2. 나가기");
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		int chooseHeal = sc.nextInt();
		switch(chooseHeal) {
		case 1 :
			if(healCount>0) {
				h.hp = 30;
				System.out.println("체력이 최대로 회복되었습니다.");
				healCount--;
				h.showHeroStat();
			}
			else {
				System.out.println("체력 회복 횟수를 모두 소모하였습니다.");
			}
			break;
		case 2 :
			return;
			
		}
		
	}
}
