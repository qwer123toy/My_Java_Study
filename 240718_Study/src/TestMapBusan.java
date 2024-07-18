import java.util.HashMap;
import java.util.Map;

public class TestMapBusan {
	public static void main(String[] args) {
		// 부산 지도
		// 부산진구 중앙대로 786 - 부전역
		// 부산진구 중앙대로 730 - 서면역
		// 부산진구 가야대로 719 - 부암역
		// 부산진구 전포대로 181 - 전포역
		
		Map<String, String> busanMap = new HashMap<>();
		busanMap.put("길고복잡한키는밸류를찾아가기위해서동등한값을넣어야하는데", "값");
		busanMap.put("부전역", "부산진구 중앙대로 786");
	}
}
