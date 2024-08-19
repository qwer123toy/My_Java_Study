import member.Member;
import member.MemberService;

public class TestMemberRelation2 {
	public static void main(String[] args) {
		MemberService service = new MemberService();
		
		// 없는 key로 검색하면 예외가 발생합니다.
		// 1. key로 조회하여 행이 존재하는지 알아보는 메소드 작성
		// 2. 위의 메소드와 findById 메소드를 호출하는 흐름을 제어하는(커넥션 제어) 메소드 작성
		
		//Member member = service.findById(6);
//		System.out.println(member);
//		service.checkExist(4);
		service.insertMemberAndSubs("둘리", "010-1234", "구독");
		// 둘리, 011-1234, 무료
	}
}