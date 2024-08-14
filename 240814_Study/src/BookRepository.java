import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookRepository {
	public int insertBook(String title, String publisher, int price) {
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection("world");
			stmt = conn.createStatement();
			String sql = "INSERT INTO books (title, publisher, price) VALUES(" + "'" + title + "'" + "," + "'"
					+ publisher + "'" + "," + price + ")";
			System.out.println("SQL 명령문 확인 : " + sql);

			return stmt.executeUpdate(sql);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(null, stmt, conn);
		}
		return 0;
	}

	public void showBook() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection("world");
			stmt = conn.createStatement();
			String sql = "select * from books;";

			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String title = rs.getString("title");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				System.out.printf("%s %s %d\n", title, publisher, price);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
	}

	public void findBookByName(String bookName) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection("world");
			stmt = conn.createStatement();
			String sql = "select * from books where title = '" + bookName + "';";

			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("bookID");
				String title = rs.getString("title");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				System.out.printf("%d. %s %s %d\n", id, title, publisher, price);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
	}

	public void findBookByPrice(int priceMin, int priceMax) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBUtil.getConnection("world");
			stmt = conn.createStatement();
			String sql = "select * from books where price between " + priceMin + " and " + priceMax + ";";

			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("bookID");
				String title = rs.getString("title");
				String publisher = rs.getString("publisher");
				int price = rs.getInt("price");
				System.out.printf("%d. %s %s %d\n", id, title, publisher, price);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
	}
}
