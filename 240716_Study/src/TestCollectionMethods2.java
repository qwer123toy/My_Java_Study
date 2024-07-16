import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCollectionMethods2 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c","c", "d", "e"));

		List<String> toRemove = new ArrayList<>(Arrays.asList("a", "b"));

		list.removeAll(toRemove);
		
		System.out.println(list);
	}
}
