import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		//각 쌍을 저장 하며 key,value 값으로 저장
		
		map.put("사과", "마시쪙");
		map.put("바나나", "길어");
		System.out.println(map);
		
		map.put("사과", "쏘리쏘리");
		System.out.println(map.toString());
		
		map.put("자", "자자");
		System.out.println(map.toString());
		map.put("a", "bb");
		System.out.println(map.toString());
	}
}
