import java.util.Scanner;

public class Temple {
	int healCount = 3;
	
	public void fullHeal(HeroStat h) {
		System.out.println("��ȸ���� ������ ���� ���� ȯ���մϴ١�");
		System.out.printf("�� 3ȸ �� %dȸ �̿��Ͻ� �� �ֽ��ϴ�.\n", healCount);
		System.out.println("1. ȸ��  2. ������");
		System.out.print("�Է� : ");
		Scanner sc = new Scanner(System.in);
		int chooseHeal = sc.nextInt();
		switch(chooseHeal) {
		case 1 :
			if(healCount>0) {
				h.hp = 30;
				System.out.println("ü���� �ִ�� ȸ���Ǿ����ϴ�.");
				healCount--;
				h.showHeroStat();
			}
			else {
				System.out.println("ü�� ȸ�� Ƚ���� ��� �Ҹ��Ͽ����ϴ�.");
			}
			break;
		case 2 :
			return;
			
		}
		
	}
}
