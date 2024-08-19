package member;

import java.sql.ResultSet;
import java.sql.SQLException;

import dbutil.IResultMapper;

public class MemberMapper implements IResultMapper<Member> {
	@Override
	public Member resultMapping(ResultSet rs) {
		try {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String phoneNumber = rs.getString("phoneNumber");
			
			return Member.builder()
					.id(id)
					.name(name)
					.phoneNumber(phoneNumber)
					.build();
		} catch (SQLException e) {
			e.printStackTrace();
			
			throw new RuntimeException("member 매핑 중 예외 발생", e);
		}
	}
}





