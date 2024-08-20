package member;

import java.sql.ResultSet;
import java.sql.SQLException;

import dbutil.IResultMapper;

public class SubscribeMapper implements IResultMapper<Subscribe> {
	@Override
	public Subscribe resultMapping(ResultSet rs) {
		try {
			int no = rs.getInt("no");
			int memberId = rs.getInt("memberId");
			String subscribeType = rs.getString("subscribeType");
			
			return new Subscribe(no, memberId, subscribeType);
		} catch (SQLException e) {
			e.printStackTrace();
			
			throw new RuntimeException("매핑 중 예외 발생", e);
		}
	}
}
