interface Minusable{
	public int minus(int a, int b);
}
public interface Calculatable {
	public abstract int sum(int a, int b); // abstract 선언을 빼줘도 추상 메소드로 작성됨, private, protected 불가능
}

class Calculator implements Calculatable, Minusable {

	@Override
	public int sum(int a, int b) {
		System.out.println("이모 여기 계산이요!");
		return a + b;
	}

	@Override
	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}

class Computer implements Calculatable, Minusable {

	@Override
	public int sum(int a, int b) {
		System.out.println("콤퓨타");
		return a + b;
	}
	
	public int minus(int a, int b) {
		return a-b;
	}

}