//책
//제목
//작가명
//가격
public class NameChecker {
	public boolean check(String name) {
		
		if(name == null)
			return false;
		if(name.contains(" "))
			return false;
		if(name.isEmpty())
			return false;
		if(name.length()>10)
			return false;
		
		return true;
	}

	public static void main(String[] args) {
		NameChecker checker = new NameChecker();
		System.out.println(checker.check("1234567890a"));
	}
}
