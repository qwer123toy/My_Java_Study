package Static;

class MyUtil{
	public static void printSomething() {
		System.out.println("Ãâ·Â");
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
}

public class TestStaticMethod {
	 public static void main(String[] args) {
		MyUtil.printSomething();
		System.out.println(MyUtil.sum(1, 2));
		
	}
}
