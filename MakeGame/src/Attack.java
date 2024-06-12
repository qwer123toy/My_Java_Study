
public class Attack {

	public int HeroAttack(HeroStat h, MonsterStat m) {
		int finalM_hp = m.m_hp - (h.at - m.m_am);
		System.out.println("[용사의 공격]");
	
			System.out.printf("적 몬스터의 체력이 %d 감소하였습니다.(몬스터 현재 HP : %d)\n", (h.at - m.m_am), finalM_hp);
			return finalM_hp;
		
	}

	public int MonsterAttack(HeroStat h, MonsterStat m) {
		int finalH_hp = h.hp - (m.m_at - h.am);
		System.out.println("[몬스터의 공격]");

			System.out.printf("%s의 체력이 %d 감소하였습니다.(현재 HP : %d)\n", h.name, (m.m_at - h.am), finalH_hp);
			return finalH_hp;
		
	}
}
