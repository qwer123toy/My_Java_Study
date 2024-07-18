import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestMapOperation {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("D", "디");
		map.put("A", "에이");
		map.put("E", "이");
		map.put("B", "비");
		map.put("C", "씨");
		//map.put(null, "씨");// key 값에 null도 들어갈 수 있으니 주의
		map.remove("A"); //하나만 썼을 시 key 값에 해당하는 내용을 삭제
		System.out.println(map);
		
		map.remove("비");
		System.out.println(map);
		
		map.remove("B", "비"); //파라미터 두개일 때는 value값가지 정확히 입력해야됨
		System.out.println(map);
		
		//해당하는 키 값의 value 값을 변경
		String replace = map.replace("D", "알파벳 디"); 
		System.out.println("변경 이전 값 " + replace);
		System.out.println(map);
	}
}








