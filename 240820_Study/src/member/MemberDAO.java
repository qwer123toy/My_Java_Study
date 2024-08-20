package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dbutil.DBUtil;
import dbutil.IResultMapper;

public class MemberDAO {
	public static final IResultMapper<Member> memberMapper = new MemberMapper();
	
	public Member findByPk(int pk) {
		String sql = "SELECT * FROM members WHERE id = ?";
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection("my_study_db");
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, pk);
			rs = stmt.executeQuery();
			
			if (rs.next()) {
				Member member = memberMapper.resultMapping(rs);
				return member;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return null;
	}
	
	
	public int findByPhoneNumber(String phoneNumber) {
		String sql = "SELECT * FROM members WHERE phoneNumber = ?";
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = DBUtil.getConnection("my_study_db");
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, phoneNumber);
			rs = stmt.executeQuery();

			if (rs.next()) {
				System.out.println("중복이 있음");
				return -1;
			} else {
				return 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return 0;
	}
	
	
	public int insert(String name, String phoneNumber, Connection conn) {
		String sql = "INSERT INTO members (name, phoneNumber) VALUES (?, ?);";
		int chkDup = findByPhoneNumber(phoneNumber);
		if(chkDup != -1) {
			PreparedStatement stmt = null;
			ResultSet rs = null;
			
			try {
				stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				stmt.setString(1, name);
				stmt.setString(2, phoneNumber);
				
				int result = stmt.executeUpdate();
				if (result == 1) {
					rs = stmt.getGeneratedKeys();
					rs.next();
					
					return rs.getInt(1);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBUtil.closeAll(rs, stmt, null);
			}
			return -1;
		}
		else {
			return -1;
		}
		
	}
}








