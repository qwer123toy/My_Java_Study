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
		System.out.println("          게임을 시작합니다          ");
		System.out.println("====================================");
		System.out.println("용사 이름을 입력하세요");
		System.out.print("입력 : ");
		herostat.name = sc.nextLine();

		System.out.printf("\n환영합니다 %s 용사님!\n", herostat.name);
		herostat.HeroFirstSetting();
		herostat.showHeroStat();
		
		while (herostat.gameOver(herostat.hp)) {
			monsterstat = new MonsterStat();
			System.out.println("\n====================================");
			System.out.println("      무엇을 하시겠습니까?           ");
			System.out.println("====================================");
			System.out.println("1. 상태창 확인");
			System.out.println("2. 모험 떠나기");
			System.out.println("3. 상점 들리기");
			System.out.println("4. 신전 들리기");
			System.out.println("0. 게임 종료");
			System.out.print("입력 : ");
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
					System.out.println("           게임을 종료합니다         ");
					System.out.println("====================================");
					System.out.println("총 잡은 몬스터 수 : " + herostat.killCount);
					return;
				default:
					System.out.println("올바른 번호를 입력하세요");
					break;
			}
		}

		sc.close();
	}

}
