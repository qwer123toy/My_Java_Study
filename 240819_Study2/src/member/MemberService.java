package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import dbutil.DBUtil;
import dbutil.IResultMapper;

public class MemberService {
	private static final IResultMapper<Subscribe> subscribeMapper = new SubscribeMapper();
	private static final IResultMapper<Member> memberMapper = new MemberMapper();

	public void checkExist(int key) {
		String sql = "SELECT id FROM members A\r\n" + 
	"	LEFT JOIN subscribe B ON A.id = B.memberId\r\n"
				+ "    WHERE id = ?";
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection("my_study_db");
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, key);

			rs = stmt.executeQuery();
			
			if (!rs.next()) {
				System.out.println("행이 없습니다.");
			} else {
				System.out.println(rs.getInt("id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();

			throw new RuntimeException("Database 작업 중 SQL 예외가 발생했습니다.", e);
		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
	}

	public Member findById(int key) {
		String sql = "SELECT * FROM members A\r\n" + 
	"	LEFT JOIN subscribe B ON A.id = B.memberId\r\n"
				+ "    WHERE id = ?";

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection("my_study_db");
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, key);

			rs = stmt.executeQuery();

			if (rs.next()) {
				Subscribe subscribe = subscribeMapper.resultMapping(rs);
				Member member = memberMapper.resultMapping(rs);

				member.setSubscribe(subscribe);

				return member;
			} else {
				throw new RuntimeException("행 정보를 찾을 수 없습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();

			throw new RuntimeException("Database 작업 중 SQL 예외가 발생했습니다.", e);
		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
	}
	
	public void insertMemberAndSubs(String name, String phoneNumber, String subscribeType) {
		 String sql = "INSERT INTO members(name, phonenumber) VALUES(?, ?)";
		    String sql2 = "INSERT INTO subscribe(memberid, subscribeType) VALUES(?, ?)";
		    Connection conn = null;
		    PreparedStatement stmt = null;
		    ResultSet rs = null;

		    try {				
		        conn = DBUtil.getConnection("my_study_db");
		        conn.setAutoCommit(false);
		        stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
		        stmt.setString(1, name);
		        stmt.setString(2, phoneNumber);

		        int row = stmt.executeUpdate();
		        rs = stmt.getGeneratedKeys();
		        int memberId = 0;
		        if (rs.next()) {
		            memberId = rs.getInt(1);
		        } else {
		            throw new RuntimeException("행 정보를 찾을 수 없습니다.");
		        }

		        stmt = conn.prepareStatement(sql2);
		        stmt.setInt(1, memberId);
		        stmt.setString(2, subscribeType);
		        stmt.executeUpdate();  // 여기를 executeUpdate()로 수정
		        conn.commit();
		    } catch (SQLException e) {
		        e.printStackTrace();
		        throw new RuntimeException("Database 작업 중 SQL 예외가 발생했습니다.", e);
		    } finally {
		        DBUtil.closeAll(rs, stmt, conn);
		    }
	}
}
