import java.util.HashMap;
import java.util.Map;

public class TestMap3 {
	public static void main(String[] args) {
		Map<String, Integer> menu = new HashMap<>();
		
		
		menu.put("돼지국밥", 8000);
		menu.put("순대국밥", 9000);
		menu.put("섞어국밥", 9000);
		
		System.out.println(menu.toString());
		System.out.println(menu.values());

//		Integer price = menu.get("돼지국밥");
//		price +=500;
		menu.put("돼지국밥", 8500);
		
		System.out.println(menu);
	
	}
}
