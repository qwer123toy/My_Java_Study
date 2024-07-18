import java.util.HashMap;
import java.util.Map;

public class TestMap2 {
	public static void main(String[] args) {
		Map<Integer, String> student = new HashMap<>();
		
		
		student.put(1002, "둘리");
		student.put(1001, "길동");
		student.put(1003, "도우너");
		System.out.println(student.toString());
		
		System.out.println(student.get(1003)); // key 값을 통해 검색
		System.out.println(student.get(1005)); // 없는 키값은 null을 반환함
		System.out.println(student.containsKey(1002)); // 해당 키값 보유 확인
		System.out.println(student.containsKey(1004)); // 없으면 false 반환
	}
}
