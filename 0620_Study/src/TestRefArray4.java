import java.util.Arrays;

class Car {
	String model;
	int speed;

	public Car(String model, int speed) {
		super();
		this.model = model;
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void printState() {
		System.out.println("차종 : " + model);
		System.out.println("속도 : " + speed);
	}
}

public class TestRefArray4 {
	public static void main(String[] args) {
		Car[] arr = new Car[] { new Car("아반떼", 40), new Car("소나타", 50), new Car("그랜저", 60) };
		
		arr[0].printState();
	}
}

