package dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUtil {
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/";
	private static final String id = "root";
	private static final String password = "root";

	public static void loadDriver() {
		try {
			Class.forName(driver);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection(String dbName) throws SQLException {
		return DriverManager.getConnection(url + dbName + "?serverTimezone=UTC", id, password);
	}

	public static void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void closeStatement(Statement stmt) {
		if (stmt != null) {
			try {
				stmt.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void closeAll(ResultSet rs, Statement stmt, Connection conn) {
		// 객체 생성은 Connection, Statement, ResultSet 순서로 했지만
		// 자원 해제는 역순으로
		// 순서를 그렇게 하지 않으면 당장은 괜찮을지 몰라도 나중에 문제가 생길 수 있음
		closeResultSet(rs);
		closeStatement(stmt);
		closeConnection(conn);
	}
}