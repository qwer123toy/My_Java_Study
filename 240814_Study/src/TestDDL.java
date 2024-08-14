import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//책(books) 테이블 생성하기
// bookID INT PK, AI
// title VARCHAR(50) NN
// publisher VARCHAR(30)
// price INT NN

public class TestDDL {
	public static void main(String[] args) {
		// 드라이버 로드 -> 연결 -> 명령 수행 -> 결과 확인 -> 자원해제
		
		//현재 이 부분은 자동적으로 되긴 하지만 해두는게 좋음
		String driver = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/world";
		String id = "root";
		String password = "root";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String query = "create table if NOT exists books(\r\n" + 
				" bookID INT Primary Key Auto_Increment,\r\n" + 
				" title VARCHAR(50) Not Null,\r\n" + 
				" publisher VARCHAR(30),\r\n" + 
				" price INT Not Null\r\n" + 
				");";
		
		try {
			conn = DriverManager.getConnection(url, id, password);
			stmt = conn.createStatement();
			stmt.executeUpdate(query);
			
			System.out.println("테이블 생성");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(rs !=null)
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(stmt !=null)
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(conn !=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}
}
