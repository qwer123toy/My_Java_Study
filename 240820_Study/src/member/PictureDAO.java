package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbutil.DBUtil;

public class PictureDAO {
	
	public byte[] getData(int key) {
		String sql = "SELECT data FROM picture WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection("my_study_db");
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, key);
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				byte[] bytes = rs.getBytes("data");
				return bytes;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return null;
	}
	
	
	public int insert(String name, byte[] data) {
		String sql = "INSERT INTO picture (name, data) VALUES (?, ?)";
		
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			conn = DBUtil.getConnection("my_study_db");
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, name);
			stmt.setBytes(2, data);
			
			return stmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(null, stmt, conn);
		}
		return 0;
	}
}
