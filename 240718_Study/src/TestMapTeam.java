import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TestMapTeam {
	public static void main(String[] args) {
		//가장 왼쪽이 조장
		//1조 : 길동, 둘리, 도우너
		//2조 : 톰, 브래드
		//3조 : 폴
		//4조 : 철수, 영희
		
		//1. 각조에 몇명씩 있는지 확인
		//2. 4조의 이름 명단 확인
		//3. 2조의 이름 명단을 가나다 순으로 확인
		//4. 2조의 조장을 확인
		//5. 3조에 조원 '로우' 추가하기
		
		Map<Integer, List> team = new HashMap<>();
		List<String> team01 = new ArrayList<>(Arrays.asList("길동","둘리","도우너"));
		List<String> team02 = new ArrayList<>(Arrays.asList("톰","브래드"));
		List<String> team03 = new ArrayList<>(Arrays.asList("폴"));
		List<String> team04 = new ArrayList<>(Arrays.asList("철수","영희"));
		
		team.put(1, team01);
		team.put(2, team02);
		team.put(3, team03);
		team.put(4, team04);
		System.out.println(team);
		
		for(Entry<Integer, List> entry : team.entrySet()) {
			System.out.println(entry.getKey() + "조의 인원은 " + entry.getValue().size());
		}
		System.out.println(team.get(4));
		
		//원본도 순서가 바뀌어버림
		List<String> list = new ArrayList<>(team.get(2));
		Collections.sort(list);
		System.out.println(list);
		System.out.println(team);
		
		team.get(3).add("로우");
		System.out.println(team);
		
	}
}
