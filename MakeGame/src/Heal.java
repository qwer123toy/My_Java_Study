
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

			System.out.println("ȸ�� ��ų�� ����߽��ϴ�.");
			System.out.println("HP(+10)/MP(-5)");
			System.out.println("�� �ִ� ü�� �̻����δ� ȸ�� ���� �ʽ��ϴ�.");
		} else {
			System.out.println("������ �����մϴ�.");
		}

	}

}
