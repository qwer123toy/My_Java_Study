import java.util.Objects;

public class TestObjectUtil {
	public static void main(String[] args) {
		String str = "Hello";
		String str2 = "Hello";
		String str3 = null;
		
		System.out.println(str2.equals(str3));
		//System.out.println(str3.equals(str2));
		System.out.println(Objects.equals(str, str3));
		System.out.println(Objects.equals(str, str2));
		System.out.println(Objects.isNull(str3));
		System.out.println(Objects.nonNull(str2));
		
	}
}
