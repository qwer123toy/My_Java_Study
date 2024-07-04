package Static;

public interface MyUtil_Interface { // 인터페이스에서는 추상 메소드와 상관없이 정적으로 존재하는 상수 or 전역 메소드가 존재 가능
	public static final int num = 0;//인터페이스에서 선언하는 변수는 값이 정해진 static final 상수
	
	public static void print() {
		System.out.println("출력");
	}
	
	public static void main(String[] args) {
		System.out.println(MyUtil_Interface.num);
		MyUtil_Interface.print();
	}
}
