import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMapIteration {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		//각 쌍을 저장 하며 key,value 값으로 저장
		
		map.put("D", "디");
		map.put("C", "씨");
		map.put("A", "에이");
		map.put("B", "비");
		map.put("E", "이");
		System.out.println(map);
		
		Set<String> keySet = map.keySet(); //맵에 있는 모든 키를 Set으로 반환
		
		for(String key : keySet) {
			String value = map.get(key);
			System.out.println(value);
		}
		
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(map.get(iterator.next()));
		}
	}
}
