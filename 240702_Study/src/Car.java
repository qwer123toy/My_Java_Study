
public class Car {
	private int speed;
	
	public void increaseSpeed() {
		speed++;
	}
	public void decreaseSpeed() {
		speed--;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + "]";
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
