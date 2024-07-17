import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class StringSplit {
	public static void main(String[] args) {
		// String text = "세상의\t 모서리\n 구부정하게";
		String text = "세상의,모서리,구부정하게";

		// String[] textSplit = text.split("\\s");//모든 공백들(개행문자, 탭, 공백)
		// String[] textSplit = text.split(" ");
		// System.out.println(Arrays.toString(textSplit));

		List<String> list = new ArrayList<>();

		StringTokenizer s = new StringTokenizer(text, ",", false);
		// 파라미터값(자르는 문자, 자르는 기준(공백이 디폴트), 기준 단어 출력 유무 판단(안나오는게 디폴트))

		while (s.hasMoreTokens()) {
			String token = s.nextToken();
			list.add(token);
		}
	}
}
