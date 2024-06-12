
public class Heal {

	public void HeroHeal(HeroStat h) {
		if (h.mp >= 5) {
			if (h.hp < 20) {
				h.hp += 10;
				h.mp -= 5;
			} else {
				h.hp = 30;
				h.mp -= 5;
			}

			System.out.println("회복 스킬을 사용했습니다.");
			System.out.println("HP(+10)/MP(-5)");
		} else {
			System.out.println("마나가 부족합니다.");
		}

	}

}
