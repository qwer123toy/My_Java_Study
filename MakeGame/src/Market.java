import java.util.Scanner;

public class Market {
	int sword = 2;
	int armor = 1;
	int shield = 1;

	public void marketPlace(HeroStat h) {
		System.out.println("�ڻ����� ���Ű��� ȯ���մϴ١�");
		 System.out.println("���� �Ǹ� ���� ���� �Ʒ��� �����ϴ�.");
		 System.out.printf("��(���ݷ�+1) : 100 Gold %d��\n",sword);
		 System.out.printf("����(����+1) : 100 Gold %d��\n",armor);
		 System.out.printf("����(����+1) : 200 Gold %d��\n",shield);
		 System.out.println("� ���� �����Ͻðڽ��ϱ�?");
		 System.out.println("1. ��  2. ����  3. ����  0. ������");
		 System.out.print("�Է� : ");
		 System.out.printf("���� ���� �� : %d",h.money);
		 Scanner sc = new Scanner(System.in);
		 int chooseMarket = sc.nextInt();
		 switch(chooseMarket) {
		 case 1:
			 if(sword>0&&h.money>=100) {
			 System.out.println("���� �����Ͽ����ϴ�!");
			 System.out.println("���ݷ��� 1 �����Ͽ����ϴ�.");
			 h.at++;
			 h.showHeroStat();
			 h.money -= 100;
			 sword--;
			 }
			 else if(h.money<100)
				 System.out.println("���� ���� ���� �����մϴ�.");
			 else {
				 System.out.println("���� ���� ���� �����ϴ�.");
			 }
			 break;
		 case 2 :
			 if(armor>0) {
				 System.out.println("������ �����Ͽ����ϴ�!");
				 System.out.println("������ 1 �����Ͽ����ϴ�.");
				 h.am++;
				 h.showHeroStat();
				 h.money -= 100;
				 armor--;
				 }
			 else if(h.money<100)
				 System.out.println("���� ���� ���� �����մϴ�.");
				 else {
					 System.out.println("���� ���� ������ �����ϴ�.");
				 }
				 break;
		 case 3 : 
			 if(shield>0) {
				 System.out.println("���и� �����Ͽ����ϴ�!");
				 System.out.println("������ 1 �����Ͽ����ϴ�.");
				 h.am++;
				 h.showHeroStat();
				 h.money -= 200;
				 shield--;
				 }
			 else if(h.money<200)
				 System.out.println("���� ���� ���� �����մϴ�.");
				 else {
					 System.out.println("���� ���� ���а� �����ϴ�.");
				 }
				 break;
		 }
		
	}
}
