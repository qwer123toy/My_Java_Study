import java.util.Arrays;
import java.util.Comparator;

import javax.swing.text.Document;

public class TestLocalClass2 {
	public static void main(String[] args) {
		
		Document2[] arr = new Document2[] { new Document2(3), new Document2(2), new Document2(1)};
		
//		class PriComp implements Comparator<Document2>{

		//익명 클래스
		Comparator comp = new Comparator<Document2>(){
			@Override
			public int compare(Document2 o1, Document2 o2) {
				// TODO Auto-generated method stub
				return o1.getPriority() - o2.getPriority();
			}
			
		};
		Arrays.sort(arr, comp);
		System.out.println(Arrays.toString(arr));
	}

}
