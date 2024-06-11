
class Robot {
	boolean isOn;
	public void turnOn() {
		isOn = true;
	}
	public void turnOff() {
		isOn = false;
	}
	public void sayHello() {
		System.out.println("안녕");
	}
	public String toString() {
		if(isOn)
		return "로봇이 " + (isOn ? "켜졌습니다" : "꺼졌습니다.");
		else
			return "전원 꺼짐";
	}
}

public class TestRobot {
	public static void main(String[] args) {
		Robot myRobot = new Robot();

		myRobot.turnOn();
		System.out.println(myRobot);
		myRobot.sayHello();
		myRobot.turnOff();
		System.out.println(myRobot);
		
		
	}

}
