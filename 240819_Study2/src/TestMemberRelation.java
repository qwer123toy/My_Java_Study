import java.util.Arrays;

import member.Hobby;
import member.Member;
import member.Subscribe;

public class TestMemberRelation {
	public static void main(String[] args) {
		Subscribe sub = new Subscribe(1, 1, "구독");
		Hobby hobby = new Hobby(100, "축구");
		
		Member member = Member.builder().id(1)
								.name("메시")
								.phoneNumber("010-1234")
								.hobbys(Arrays.asList(hobby))
								.subscribe(sub)
								.build();
		
		System.out.println(member);
	}
}
