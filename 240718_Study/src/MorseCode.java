import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MorseCode {
	public static void main(String[] args) {
		Map<Character, String> map = new HashMap<>();
	      map.put('A', "ㆍ－");
	      map.put('B', "－ㆍㆍㆍ");
	      map.put('C', "－ㆍ－ㆍ");
	      map.put('D', "－ㆍㆍ");
	      map.put('E', "ㆍ");
	      map.put('F', "ㆍㆍ－ㆍ");
	      map.put('G', "－－ㆍ");
	      map.put('H', "ㆍㆍㆍㆍ");
	      map.put('I', "ㆍㆍ");
	      map.put('J', "ㆍ－－－");
	      map.put('K', "－ㆍ－");
	      map.put('L', "ㆍ－ㆍㆍ");
	      map.put('M', "－－");
	      map.put('N', "－ㆍ");
	      map.put('O', "－－－");
	      map.put('P', "ㆍ－－ㆍ");
	      map.put('Q', "－－ㆍ－ ");
	      map.put('R', "ㆍ－ㆍ ");
	      map.put('S', "ㆍㆍㆍ");
	      map.put('T', "－ ");
	      map.put('U', "ㆍㆍ－");
	      map.put('V', "ㆍㆍㆍ－");
	      map.put('W', "ㆍ－－ ");
	      map.put('X', "－ㆍㆍ－ ");
	      map.put('Y', "－ㆍ－－ ");
	      map.put('Z', "－－ㆍㆍ");
	      
	      //사용자에게 영단어를 입력받아, 모스부호로 변환하여 출력
	      Scanner sc = new Scanner(System.in);
	      System.out.println("영단어 하나 입력하세요");
	      String word = sc.nextLine().toUpperCase();
	      
	      for(int i=0; i<word.length(); i++) {
	    	  char charAt = word.charAt(i);
	    	  System.out.println(map.get(charAt));
	      }
	}
}
