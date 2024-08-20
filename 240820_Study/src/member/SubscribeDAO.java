package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbutil.DBUtil;
import dbutil.IResultMapper;

public class SubscribeDAO {
	private static final IResultMapper<Subscribe> subscribeMapper = new SubscribeMapper();
	
	public Subscribe findByFK(int key, Connection conn) {
		String sql = "SELECT * FROM subscribe WHERE memberId = ?";
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, key);
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				Subscribe subscribe = subscribeMapper.resultMapping(rs);
				return subscribe;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, stmt, null);
		}
		return null;
	}
	
	public int insert(int memberId, String subscribeType, Connection conn) {
		String sql = "INSERT INTO subscribe (memberId, subscribeType) VALUES (?, ?);";
		
		PreparedStatement stmt = null;
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, memberId);
			stmt.setString(2, subscribeType);
			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeStatement(stmt);
		}
		return -1;
	}
}



















