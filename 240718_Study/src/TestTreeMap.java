import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		
		map.put(50, "가");
		map.put(24, "나");
		map.put(74, "다");
		System.out.println(map);
		map.put(50, "라");
		System.out.println(map);
	}
}
