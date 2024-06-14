
public class TestStringStaticMethods {

	public static void main(String[] args) {
		String value = String.valueOf("asd");//String 클래스의 스태틱 메소드 사용
		System.out.println(value);
		
		String textnum = "3040";
		String textnum2 = "5060";
		System.out.println(textnum + textnum2);
		
		int num = Integer.parseInt(textnum);
		int num2 = Integer.parseInt(textnum2);
		int num3 = Integer.valueOf(textnum2);
		System.out.println(num+num2+num3);
	}
}

