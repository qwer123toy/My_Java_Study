package quiz;

import java.util.HashMap;
import java.util.Map;

/*
	1. 퀴즈를 하나를 볼 수 있고, 퀴즈의 정답을 입력할 수 있는 form 구성
		1-1. 입력된 문제를 재조회하여, 수정답안을 제출할 수 있음.
	2. 한번의 기회에 총 5번의 문제를 풀 수 있음.
	3. 퀴즈를 모두 푼 후, 총 점수를 확인 가능한 화면
		3-1. 제출된 문제와 정답
 */

public class Quizs {
	private Map<String, String> quizs;
	
	public Quizs() {
		quizs = new HashMap<>();
		
		quizs.put("많이 맞을수록 좋은 건?", "시험문제");
		quizs.put("매일 사과하는 동물은?", "오소리");
		quizs.put("세계에서 가장 빠른 떡은?", "헐레벌떡");
		quizs.put("깨가 죽으면?", "주근깨");
		quizs.put("대충 쏘는 총을 세글자로 하면?", "설렁탕");
		quizs.put("유럽에서만 먹는 음식은?", "이유(EU)식");
		quizs.put("도박사들은 물을 어떻게 마실까?", "홀짝홀짝");
		quizs.put("다 마셔도 남아 있는 술은?", "맥주");
		quizs.put("맥주로만 만든 빵은?", "카스테라");
		quizs.put("차가 못 다니는 나라는?", "인도");
		quizs.put("오리를 생으로 먹으면?", "회오리");
		quizs.put("소가 감전되어서 죽으면?", "우사인 볼트");
		quizs.put("헬스장에선 물을 어떻게 마실까?", "벌크업");
		quizs.put("광부가 많은 나라는?", "케냐");
		quizs.put("세상에서 가장 착한 사자는?", "자원봉사자");
		quizs.put("매일 욕을 만드는 도시는?", "뉴욕");
		quizs.put("새우가 주인공인 드라마는?", "대하드라마");
		quizs.put("김정은이 공사러 가면 하는 말은?", "공산당");
	}

	public Map<String, String> getUsers() {
		return quizs;
	}
}
