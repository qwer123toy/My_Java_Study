import java.util.Random;
import java.util.Scanner;

public class Dungeon {

	public void Fighting(HeroStat h, MonsterStat m) {
		System.out.println("\n====================================");
		System.out.println("          ������ �����Ͽ����ϴ�.       ");
		System.out.println("====================================");
		System.out.println("���Ϳ� �������ϴ�!!");
		System.out.println("�������� ���� ����");
		System.out.println("====================================\n");
		m.showHeroStat();
		Attack attack = new Attack();
		outer: while (true) {
			System.out.println("\n====================================");
			System.out.println("   �����ϼ���:                ");
			System.out.println("      1. ����  2. ȸ��  3. ����      ");
			System.out.println("====================================");
			System.out.print("�Է� : ");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			System.out.println("====================================\n");
			switch (choose) {
			case 1:
				m.m_hp = attack.HeroAttack(h, m);
				h.hp = attack.MonsterAttack(h, m);
				if (h.hp <= 0) {
					break outer;
				} else if (m.m_hp <= 0) {
					System.out.println("\n====================================");
					System.out.println("       ���Ͱ� ���������ϴ�!       ");
					System.out.println("             - ���� �¸� -           ");
					System.out.println("====================================\n");
					h.killCount++;
					h.money +=100;
					break outer;

				} else {
//					h.showHeroStat();
//					m.showHeroStat();
					break;
				}

			case 2:
				Heal heal = new Heal();
				heal.HeroHeal(h);
				h.hp = attack.MonsterAttack(h, m);
				h.showHeroStat();
				break;
			case 3:
				Random r = new Random();
				int runRate = r.nextInt(10);
				if (runRate > 3) {
					System.out.println("\n====================================");
					System.out.println("         ���ֿ� �����߽��ϴ�.       ");
					System.out.println("====================================\n");
					break outer;
				} else {
					System.out.println("\n====================================");
					System.out.println("         ���ֿ� �����߽��ϴ�.       ");
					System.out.println("====================================\n");
					h.hp = attack.MonsterAttack(h, m);
					if (h.hp <= 0) {
						break outer;
					}
					break;
				}
			}

		}
	}
}
