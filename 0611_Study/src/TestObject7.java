/*
 	객체지향
 
 */

// 
class Car {

	int speed;
	
	public void printCurrentSpeed() {
		System.out.println("현재 속도는 " + speed);
	}

}

public class TestObject7 {
	public static void main(String[] args) {
		Car c = new Car();
		c.speed = 100;
		c.printCurrentSpeed();
	}
}
