
public class TestShoes {
	public static void main(String[] args) {
		
		Shoes s1 = new Shoes("����Ű", 30000);
		Shoes s2 = new Shoes("�Ƶ�ٽ�", 30000);
		Shoes s3 = new Shoes("���ٽ�", 30000);
		Shoes s4 = new Shoes("����Ű", 50000);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
	}
}
