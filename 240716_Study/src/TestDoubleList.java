import java.util.ArrayList;
import java.util.List;

public class TestDoubleList {
	public static void main(String[] args) {
		List<Double> list = new ArrayList<>();
		
		list.add(50.55);
		
		System.out.println(list.size());
		
		System.out.println(list.get(0));
	}
}
