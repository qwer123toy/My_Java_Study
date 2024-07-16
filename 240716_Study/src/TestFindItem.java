import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestFindItem {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("원소1","원소2","원소3","원소4","원소5"));
		
				
		//System.out.println(list.size());
		int index = 0;
		for(String p: list) {
			if(p.equals("원소4")) {
			System.out.println("인덱스 : " + index);
			}
			index++;
		}
		
		int find = list.indexOf("원소4");//해당하는 원소의 인덱스 값을 출력(처음부터 찾음)
		int find2 = list.lastIndexOf("원소4"); // 역순으로 찾음
		System.out.println(find);
		System.out.println(find2);
		System.out.println(list.indexOf("짠"));//없으면 -1 출력
		
	}
	
	
	
}
