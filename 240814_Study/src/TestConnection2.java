import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestConnection2 {
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
//			String query = "SELECT Code, Name, Population FROM country;";

			//country(name 컬럼값 패턴 검색 Korea로 끝나는 국가코드, 국가 이름 , 인구 조회)
			String query = "SELECT Code, Name, Population FROM country WHERE name like '%korea';";
			//String query = "SELECT Code, Name, Population FROM country WHERE RIGHT(name,5)='korea';";
			rs = stmt.executeQuery(query);
			while (rs.next()) {
				String code = rs.getString("Code");
				String name = rs.getString("Name");
				int population = rs.getInt("Population");
				System.out.printf("%s %s %d\n", code, name, population);
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
