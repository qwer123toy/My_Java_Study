import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCollectionMethods {
	public static void main(String[] args) {
		List<String> one = new ArrayList<>(Arrays.asList("a", "b", "c"));
		List<String> two = new ArrayList<>(Arrays.asList("c", "d", "e"));
		
//		one.addAll(two);
//		
//		System.out.println(one);
		
		List<String> concat = (List<String>) ((ArrayList) one).clone();
//		List<String> concat = new ArrayList<>(one);
//		concat.addAll(one);
		concat.addAll(two);
		
		System.out.println(concat);
	}
}
