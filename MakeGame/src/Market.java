import java.util.Scanner;

public class Market {
	int sword = 2;
	int armor = 1;
	int shield = 1;

	public void marketPlace(HeroStat h) {
		System.out.println("★상점에 오신것을 환영합니다★");
		 System.out.println("현재 판매 중인 장비는 아래와 같습니다.");
		 System.out.printf("검(공격력+1) : 100 Gold %d개\n",sword);
		 System.out.printf("갑옷(방어력+1) : 100 Gold %d개\n",armor);
		 System.out.printf("방패(방어력+1) : 200 Gold %d개\n",shield);
		 System.out.println("어떤 것을 구매하시겠습니까?");
		 System.out.println("1. 검  2. 갑옷  3. 방패  0. 나가기");
		 System.out.print("입력 : ");
		 System.out.printf("보유 중인 돈 : %d",h.money);
		 Scanner sc = new Scanner(System.in);
		 int chooseMarket = sc.nextInt();
		 switch(chooseMarket) {
		 case 1:
			 if(sword>0&&h.money>=100) {
			 System.out.println("검을 구매하였습니다!");
			 System.out.println("공격력이 1 증가하였습니다.");
			 h.at++;
			 h.showHeroStat();
			 h.money -= 100;
			 sword--;
			 }
			 else if(h.money<100)
				 System.out.println("보유 중인 돈이 부족합니다.");
			 else {
				 System.out.println("보유 중인 검이 없습니다.");
			 }
			 break;
		 case 2 :
			 if(armor>0) {
				 System.out.println("갑옷을 구매하였습니다!");
				 System.out.println("방어력이 1 증가하였습니다.");
				 h.am++;
				 h.showHeroStat();
				 h.money -= 100;
				 armor--;
				 }
			 else if(h.money<100)
				 System.out.println("보유 중인 돈이 부족합니다.");
				 else {
					 System.out.println("보유 중인 갑옷이 없습니다.");
				 }
				 break;
		 case 3 : 
			 if(shield>0) {
				 System.out.println("방패를 구매하였습니다!");
				 System.out.println("방어력이 1 증가하였습니다.");
				 h.am++;
				 h.showHeroStat();
				 h.money -= 200;
				 shield--;
				 }
			 else if(h.money<200)
				 System.out.println("보유 중인 돈이 부족합니다.");
				 else {
					 System.out.println("보유 중인 방패가 없습니다.");
				 }
				 break;
		 }
		
	}
}
