import java.util.HashMap;
import java.util.Map;

public class Counting {
	public static void main(String[] args) {
		//글자 개수 파악하기
		String line = "Hello. I'm a developer";
		Map<Character,Integer> count = new HashMap<>();
		
		for(int i=0; i<line.length(); i++) {
			char ch = line.charAt(i);
			if(count.containsKey(ch)) {//만약 해당 글자가 map에 있을 경우 
				Integer oldValue = count.get(ch); 
				oldValue++;
				count.put(ch,oldValue);
			}else {
				count.put(ch,1);
			}
		}
		System.out.println(count);
	}
}
