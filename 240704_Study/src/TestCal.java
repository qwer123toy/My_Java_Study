
public class TestCal {
public static void main(String[] args) {
	Calculatable calculatable = new Calculator();
	Calculatable calculatable2 = new Computer();
	
	int sum = calculatable.sum(5, 10);
	System.out.println(sum);
	
	int sum2 = calculatable2.sum(5, 10);
	System.out.println(sum2);
}
}
