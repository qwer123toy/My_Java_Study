import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

// 1. 사용자가 3 줄의 문자열을 입력합니다.

// 세상의 모서리 구부정하게
// 커버린 골칫거리 Outsider
// 걸음걸이 옷차림 이어폰 너머

// 1-1. 뛰어쓰기를 기준으로 총 몇 단어가 입력되었는지 출력
// 1-2. 뛰어쓰기를 제외한 총 문자 개수 출력
// 1-3. 위 단어들을 역순으로 출력

// String.split 메소드의 문서 내용을 확인하고 활용해보기 or StringTokenizer class 활용해보기

//1. Java 표준 라이브러리에서 유용한 데이터 구조의 활용을 위해 구성된 Collection은
//인터페이스와 클래스로 계층 구조를 형성하고 있습니다.
//이 중, 1.동적 크기를 가짐. 2.삽입된 순서를 가짐. 3.각 원소의 위치 index로 제어 및 접근가능한 구조
//의 특징을 가지는 interface명과 구현 클래스들은 무엇이 있나요?
//인터페이스: List<E>
//구현 클래스들: ArrayList<E>

//2. Java Collection의 참조 변수 선언시, interface 타입으로의 선언과 Generic 선언을 하는 이유?
//interface 타입으로 선언하는 이유 : 코드의 유연성과 다형성을 위해
//Generic  선언 이유 : 타입 안전성(컴파일 시점에서 타입 검사를 수행)과 가독성 향상을 위해

//3. Java Collection은 객체 참조만을 가집니다. 원시형 자료는 어떻게 추가할 수 있나요?
//자바의 제네릭은 객체 참조만을 다룰 수 있으므로, 원시형 데이터 타입(ex. int, double 등)을 추가하려면 
//해당 타입의 wrapper 클래스(ex. Integer, Double 등)를 사용해야 함

//4. List의 모든 원소를 순차적으로 접근 하는 방법들?
//for, for-each, Iterator

//5. List<MyObject> 객체를 Collections.sort 메소드를 활용해 정렬하기 위해, 수행할 수 있는 방법? 
//외부 Compartor 클래스를 만들어서 사용하거나, 자체적으로 Comparable을 재정의하여 정렬 

public class Q {
	public static void main(String[] args) {
//		String[] split = "가나다 라마바 사아자".split(" ");
//		System.out.println(Arrays.toString(split));
		Scanner sc = new Scanner(System.in);

		String[] inputString = new String[3];

		List<String> line = new ArrayList<>();

//		for (int i = 0; i < 3; i++) {
//			System.out.print("문자열 입력 : ");
//			inputString[i] = sc.nextLine();
//			line.add(inputString[i]);
//		}

		line.add("세상의 모서리 구부정하게");
		line.add("커버린 골칫거리 Outsider");
		line.add("걸음걸이 옷차림 이어폰 너머");
		inputString[0] = "세상의 모서리 구부정하게";
		inputString[1] = "커버린 골칫거리 Outsider";
		inputString[2] = "걸음걸이 옷차림 이어폰 너머";

		String result = inputString[0].concat(" " + inputString[1]).concat(" " + inputString[2]);
		System.out.println(result);

		StringTokenizer s0 = new StringTokenizer(result);
		int sentenceLength = 0;
		int count = s0.countTokens();
		while (s0.hasMoreTokens()) {
			
			String checkToken = s0.nextToken();
			System.out.print(checkToken.length() + " ");
			sentenceLength += checkToken.length();
			// System.out.println(s0.nextToken());
		}
		
		System.out.println();
		System.out.println("사용한 단어 개수 : " + count);
		System.out.println("총 문자 개수 : " + sentenceLength);
		
		Collections.sort(line, Collections.reverseOrder());
		System.out.println(line);
		
		StringBuilder reverseResult = new StringBuilder(result);
		reverseResult.reverse();

		System.out.println(reverseResult);

	}
}
