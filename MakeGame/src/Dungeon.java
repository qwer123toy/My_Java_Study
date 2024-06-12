import java.util.Random;
import java.util.Scanner;

public class Dungeon {

	public void Fighting(HeroStat h, MonsterStat m) {
		System.out.println("던전에 진입하였습니다.");
		System.out.println("몬스터와 만났습니다!!");
		System.out.println("괴물과의 전투 시작");
		m.showHeroStat();
		Attack attack = new Attack();
		outer: while (true) {
			System.out.println("1. 공격 2. 회복 3. 도주 ");
			Scanner sc = new Scanner(System.in);
			int choose = sc.nextInt();
			switch (choose) {
			case 1:

				m.m_hp = attack.HeroAttack(h, m);
				h.hp = attack.MonsterAttack(h, m);
				if (h.hp <= 0) {
					break outer;
				} else if (m.m_hp <= 0) {

					System.out.println("몬스터가 쓰러졌습니다!");
					System.out.println("-전투 승리-");
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
				h.showHeroStat();
				break;
			case 3:
				Random r = new Random();
				int runRate = r.nextInt(10);
				if (runRate > 3) {
					System.out.println("도주에 성공했습니다.");
					break outer;
				} else {
					System.out.println("도주에 실패했습니다.");
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
