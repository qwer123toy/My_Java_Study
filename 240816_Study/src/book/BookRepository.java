package book;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.management.RuntimeErrorException;

import dbutil.DBUtil;

// 240814 수업때 생성
// 240816 수업 이어서

public class BookRepository {
	// Mapping
	private List<Book> resultMapping(ResultSet rs) throws SQLException {

		List<Book> list = new ArrayList<>();

		while (rs.next()) {
			int bookId = rs.getInt("bookId");
			String title1 = rs.getString("title");
			String publisher1 = rs.getString("publisher");
			int price1 = rs.getInt("price");

			list.add(new Book(bookId, title1, publisher1, price1));
		}
		return list;
	}

	public int insertBook(String title, String publisher, int price) {
		Connection conn = null;
		Statement stmt = null;

		try {
			conn = DBUtil.getConnection("world");
			stmt = conn.createStatement();

			String sql = "INSERT INTO books (title, publisher, price) VALUES ('" + title + "', " + "'" + publisher
					+ "', " + price + ")";

			System.out.println("SQL 명령문 확인 : " + sql);

			return stmt.executeUpdate(sql);

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBUtil.closeAll(null, stmt, conn);
		}
		return 0;
	}

	// 책 목록 조회하는 메소드
	public List<Book> selectAllRows() {

		String sql = "SELECT bookId, title, publisher, price FROM books;";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection("world");

			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);
			return resultMapping(rs);

		} catch (SQLException e) {
			throw new RuntimeException(e);

		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
	}

	// 제목 목록 중 일치하는 행 검색
	public List<Book> findByTitleAndPrint(String title) {
		String sql = "select * from books where title = '" + title + "'";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection("World");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			return resultMapping(rs);

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return Collections.EMPTY_LIST;
	}

	// 가격 범위로 검색하는 메소드
	public List<Book> findByPriceAndPrice(int start, int end) {
		String sql = "SELECT * FROM books WHERE price BETWEEN " + start + " AND " + end;

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection("World");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			return resultMapping(rs);

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return Collections.EMPTY_LIST;
	}
}