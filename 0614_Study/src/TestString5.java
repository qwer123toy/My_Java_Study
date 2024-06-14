//책 잊지말고 Happy happy Thing!
//제목
//작가명
//가격
public class TestString5 {

	public static void main(String[] args) {
		String withSpace = "         word word     ";
		
		System.out.println(withSpace.trim());
		
		String onlySpace = "            ";
		System.out.println(onlySpace.trim().isEmpty());
		System.out.println(onlySpace.length());
	}
}
