import java.util.Random;

public class MonsterStat {
	Random r = new Random();
	int m_hp=r.nextInt(5)+6;
	int m_mp;
	int m_at=r.nextInt(3)+3;
	//int m_at=10;
	int m_am=1;
	int m_sk1;

	public void showHeroStat() {
		System.out.println("<몬스터의 현재 상태>");
		System.out.println("<체력 : " + m_hp + ">");
		System.out.println("<공격력 : " + m_at + ">");
		System.out.println("<방어력 : " + m_am + ">");
	}
}
