
public class TestPerson {
	public static void main(String[] args) {
		Person p1 = new Person("�Ѹ�",22);
		Person p2 = new Person("����",23);
		Person p3 = new Person("�Ѹ�",22);
		Person p4 = new Person("����",25);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		System.out.println(p2.equals(p4));
	}
}
