import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestMapIteration3 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		// 각 쌍을 저장 하며 key,value 값으로 저장

		map.put("D", "디");
		map.put("C", "씨");
		map.put("A", "에이");
		map.put("B", "비");
		map.put("E", "이");
		System.out.println(map);
		
		System.out.println(map.get("A"));
		System.out.println(map.get("에이"));//기본적으로 key로 접근하며 value로 접근은 안됨
		Collection<String> values = map.values(); //value 값들을 Collection에 저장
		
		for(String v : values) {
			System.out.print(v + " ");
		}
	}
}
