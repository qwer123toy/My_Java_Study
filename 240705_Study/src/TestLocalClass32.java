import java.util.Scanner;

public class TestLocalClass32 {
	public static void main(String[] args) {
		Object o = new Object() {
			@Override
			public String toString() {
				return "¿Á∏Ì¿«!";
			}
		};
		System.out.println(o.toString());
	}
	
}
