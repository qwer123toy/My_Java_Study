import java.util.Scanner;

public class GamePlay {

	Attack attack;
	Dungeon dungeon;
	Heal heal;
	HeroStat herostat;
	MonsterStat monsterstat;
	Temple temple;
	Market market;
	
	public GamePlay() {
		attack = new Attack();
		dungeon = new Dungeon();
		heal = new Heal();
		herostat = new HeroStat();
		temple = new Temple();
		market = new Market();
	}
	
	public void GameStart() {

		Scanner sc = new Scanner(System.in);
		System.out.println("====================================");
		System.out.println("          ������ �����մϴ�          ");
		System.out.println("====================================");
		System.out.println("��� �̸��� �Է��ϼ���");
		System.out.print("�Է� : ");
		herostat.name = sc.nextLine();

		System.out.printf("\nȯ���մϴ� %s ����!\n", herostat.name);
		herostat.HeroFirstSetting();
		herostat.showHeroStat();
		
		while (herostat.gameOver(herostat.hp)) {
			monsterstat = new MonsterStat();
			System.out.println("\n====================================");
			System.out.println("      ������ �Ͻðڽ��ϱ�?           ");
			System.out.println("====================================");
			System.out.println("1. ����â Ȯ��");
			System.out.println("2. ���� ������");
			System.out.println("3. ���� �鸮��");
			System.out.println("4. ���� �鸮��");
			System.out.println("0. ���� ����");
			System.out.print("�Է� : ");
			int choose = sc.nextInt();
			System.out.println("====================================\n");
			switch (choose) {
				case 1:
					herostat.showHeroStat();
					break;
				case 2:
					dungeon.Fighting(herostat, monsterstat);
					break;
				case 3:
					market.marketPlace(herostat);
					break;
				case 4:
					temple.fullHeal(herostat);
					break;
				case 0:
					System.out.println("\n====================================");
					System.out.println("           ������ �����մϴ�         ");
					System.out.println("====================================");
					System.out.println("�� ���� ���� �� : " + herostat.killCount);
					return;
				default:
					System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���");
					break;
			}
		}

		sc.close();
	}

}
