
public class TestShoes {
	public static void main(String[] args) {
		
		Shoes s1 = new Shoes("나이키", 30000);
		Shoes s2 = new Shoes("아디다스", 30000);
		Shoes s3 = new Shoes("삼디다스", 30000);
		Shoes s4 = new Shoes("나이키", 50000);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		System.out.println(s2.equals(s3));
	}
}
