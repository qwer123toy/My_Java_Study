import java.util.HashMap;
import java.util.Map;

interface Calculation {
	void printCalResult(int a, int b);
}

class PlusCalculation implements Calculation {
	@Override
	public void printCalResult(int a, int b) {
		System.out.println("덧셈: " + (a + b));
	}
}

public class TestCommandMap {
	public static void main(String[] args) {
		// "+" , "-", "*"
		int a = 10;
		int b = 5;
		
		String command = "-";
		
		Map<String, Calculation> map = new HashMap<>();
		map.put("+", new PlusCalculation());
		
		
		map.put("-", new Calculation() {
			@Override
			public void printCalResult(int a, int b) {
				System.out.println(a - b);
			}
		});
		
		map.put("*", new Calculation() {
			@Override
			public void printCalResult(int a, int b) {
				System.out.println(a * b);
			}
		});
		
		map.get(command).printCalResult(a, b);
		
//		if (command.equals("+")) {
//			System.out.println(a + b);
//		} else if (command.equals("-")) {
//			System.out.println(a - b);
//		} else if (command.equals("*")) {
//			System.out.println(a * b);
//		}
	}
}






