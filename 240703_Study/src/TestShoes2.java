
public class TestShoes2 {
	public static void main(String[] args) {
		
		ShoesWithSize s1 = new ShoesWithSize("����Ű", 30000, 280);
		ShoesWithSize s2 = new ShoesWithSize("����Ű", 30000, 265);
		ShoesWithSize s3 = new ShoesWithSize("����Ű", 20000, 280);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s2.equals(s3));
	}
}
