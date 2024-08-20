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

	private MemberDAO memberDAO;
	private SubscribeDAO subscribeDAO;
	private PictureDAO pictureDAO;
	private Base64DAO base64dao;
	
	public MemberService(MemberDAO memberDAO, SubscribeDAO subscribeDAO,Base64DAO base64dao) {
		super();
		this.memberDAO = memberDAO;
		this.subscribeDAO = subscribeDAO;
		this.base64dao = base64dao;
	}
	
	public int insert(Member member) {
		String name = member.getName();
		String phoneNumber = member.getPhoneNumber();
		String subscribeType = member.getSubscribe().getSubscribeType();
		
		return insert(name, phoneNumber, subscribeType);
	}
	
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

	// Null로 결과 확인 가능한 메소드
		public Member findByIdWithNull(int key) {
			Connection conn = null;
			
			try {
				conn = DBUtil.getConnection("my_study_db");
				Member member = memberDAO.findByPk(key);
				if (member != null) {
					Subscribe subscribe = subscribeDAO.findByFK(key, conn);
					String data = base64dao.getDataByid(key);
					member.setSubscribe(subscribe);
					member.setData(data);
					return member;
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DBUtil.closeConnection(conn);
			}
			return null;
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
	
	public int insert(String name, String phoneNumber, String subscribeType) {
		Connection conn = null;
		try {
			conn = DBUtil.getConnection("my_study_db");
			conn.setAutoCommit(false);
			
			
			int	key = memberDAO.insert(name, phoneNumber, conn);
			if(key !=-1) {
				int result = subscribeDAO.insert(key, subscribeType, conn);	
				conn.commit();
			}
			
			return key;
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			DBUtil.closeConnection(conn);
		}
		return -1;
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
