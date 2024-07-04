interface Flyable {
	public abstract void fly();
}

class Bird {
	private int weight;

	public Bird(int weight) {
		super();
		this.weight = weight;
	}

}


class Duck extends Bird implements Flyable {

	public Duck(int weight) {
		super(weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("퍼덕퍼덕");
		
	}

}

class Chicken extends Bird  {

	public Chicken(int weight) {
		super(weight);
		// TODO Auto-generated constructor stub
	}


}


class AirPlane implements Flyable{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("비행기 타고 가요~");
	}
}
public class TestBird {
	public static void main(String[] args) {
		Duck duck = new Duck(10);
		Chicken chicken = new Chicken(5);
		duck.fly();
		
		Bird bird = new Duck(2);
		((Flyable) bird).fly();
		
		Flyable flyable = new Duck(3);
		flyable.fly();
		
		Flyable f = (Flyable) chicken;
	}
}
