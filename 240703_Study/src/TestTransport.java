abstract class Transport {
	protected int speed;

	public Transport(int speed) {
		super();
		this.speed = speed;
	}

	int getSpeed() {
		return speed;
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}

	public abstract void speedUp();

	public abstract void speedDown();

}

class Bicycle extends Transport {

	public Bicycle(int speed) {
		super(speed);
	}

	@Override
	public void speedUp() {
		speed += 2;

	}

	@Override
	public void speedDown() {
		speed -= 2;

	}

}

class passengerCar extends Transport {

	public passengerCar(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speedUp() {
		speed += 5;
	}

	@Override
	public void speedDown() {
		speed -= 5;

	}

}

class SportsCar extends Transport {

	public SportsCar(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void speedUp() {
		speed += 10;

	}

	@Override
	public void speedDown() {
		speed -= 10;

	}

}

public class TestTransport {
	public static void main(String[] args) {
		Bicycle bicycle = new Bicycle(10);
		bicycle.speedUp();
		System.out.println(bicycle.getSpeed());
	}
}
