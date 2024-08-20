package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Base64.Encoder;

import dbutil.DBUtil;

public class Base64DAO {
	public String getDataByid(int key) {
		String sql = "select B.data from members A LEFT JOIN base64 B on A.profileNo = B.id where A.id = ?";
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection("my_study_db");
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, key);
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				String bytes = rs.getString("data");
				return bytes;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return null;
	}
	
	public String getData(int key) {
		String sql = "SELECT data FROM base64 WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection("my_study_db");
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, key);
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				String bytes = rs.getString("data");
				return bytes;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return null;
	}
	
	
	public int insert(String name, String data) {
		String sql = "INSERT INTO base64 (name, data) VALUES (?, ?)";
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = DBUtil.getConnection("my_study_db");
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setString(2, data);
			return stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(null, stmt, conn);
		}
		return 0;
	}
}
