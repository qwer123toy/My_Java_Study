import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection {
	public static void main(String[] args) {
		// jdbc 드라이버 적재(로드)
		// mysql jdbc 드라이버 이름(명칭)
		String driver = "com.mysql.cj.jdbc.Driver";

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다.");
			// 라이브러리를 포함시키지 않았거나 이름을 틀렸을 때
		} // 1번만 실행하면 됨
		// 네트워크 상의 DB Server에 연결하기
		String url = "jdbc:mysql://localhost:3306/world";
		String id = "root";
		String password = "root";

		Connection conn = null; // DB와 연결해주는 객체
		Statement stmt = null; // 명령을 하는 객체
		ResultSet rs = null; // 결과의 집합을 살펴볼 수 있는 객체
		try { // DB 작업을 수행한 후 finally를 통해 자원 해제

			conn = DriverManager.getConnection(url, id, password);
			System.out.println("서버 연결 성공");

			stmt = conn.createStatement();
			String query = "SELECT 200;";

			rs = stmt.executeQuery(query);
			if (rs.next()) { // 한 행을 가리킴, 행이 있으면 true 
				int result = rs.getInt(1); // 타입을 명시해야함
				System.out.println(result == 200 ? "정상" : "X");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {// 연 순서 반대로 닫기
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
