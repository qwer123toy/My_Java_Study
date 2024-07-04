package Static;
class Car{
	String model;
	private static int count = 0;
	public Car(String model) {
		count++;
		this.model = model;
	}
	public static int getCount() {
		return count;
	}
	
}
public class TestCar {
	public static void main(String[] args) {
		Car c1 = new Car("�ҳ�Ÿ");
		Car c2 = new Car("�ҳ�Ÿ2");
		Car c3 = new Car("�ҳ�Ÿ3");
		//System.out.println(Car.count);
		System.out.println(Car.getCount());
		
	}
	
}
