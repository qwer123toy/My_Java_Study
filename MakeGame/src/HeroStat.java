
public class HeroStat {
	String name;
	int hp;
	int mp;
	int at;
	int am;
	int killCount = 0;
	int money = 0;
	
	public void HeroFirstSetting() {
		hp = 30;
		mp = 20;
		at = 5;
		am = 2;
	}
	public boolean gameOver(int hp) {
		if (hp <= 0) {
			System.out.println("용사가 사망하였습니다.");
			System.out.println("Game Over");
			System.out.println("총 잡은 몬스터 수 : " + killCount);
			return false;
		} else
			return true;

	}

	public void showHeroStat() {
		System.out.println("[" + name + "의 현재 상태]");
		System.out.println("[체력 : " + hp +"]");
		System.out.println("[마나 : " + mp +"]");
		System.out.println("[공격력 : " + at +"]");
		System.out.println("[방어력 : " + am +"]");
	}
}
