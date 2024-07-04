package Static;

public class StaticBlock {
	static { // 동적흐름과 무관하게 정적인 static을 미리 실행한 후 main을 실행
		System.out.println("스태틱 블럭");
		System.out.println("JVM에 의해 실행");
	}
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
	}
}
