
public class Attack {

	public int HeroAttack(HeroStat h, MonsterStat m) {
		int finalM_hp = m.m_hp - (h.at - m.m_am);
		System.out.println("[����� ����]");
	
			System.out.printf("�� ������ ü���� %d �����Ͽ����ϴ�.(���� ���� HP : %d)\n", (h.at - m.m_am), finalM_hp);
			return finalM_hp;
		
	}

	public int MonsterAttack(HeroStat h, MonsterStat m) {
		int finalH_hp = h.hp - (m.m_at - h.am);
		System.out.println("[������ ����]");

			System.out.printf("%s�� ü���� %d �����Ͽ����ϴ�.(���� HP : %d)\n", h.name, (m.m_at - h.am), finalH_hp);
			return finalH_hp;
		
	}
}
