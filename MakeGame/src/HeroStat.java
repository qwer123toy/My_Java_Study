
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
			System.out.println("��簡 ����Ͽ����ϴ�.");
			System.out.println("Game Over");
			System.out.println("�� ���� ���� �� : " + killCount);
			return false;
		} else
			return true;

	}

	public void showHeroStat() {
		System.out.println("[" + name + "�� ���� ����]");
		System.out.println("[ü�� : " + hp +"]");
		System.out.println("[���� : " + mp +"]");
		System.out.println("[���ݷ� : " + at +"]");
		System.out.println("[���� : " + am +"]");
	}
}
