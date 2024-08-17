package products;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

import dbutil.DBUtil;

// 240816 수업

public class ProductDAOImpl implements IProductDAO {
	private Product resultMapping(ResultSet rs) throws SQLException {
		int no = rs.getInt("no");
		String production = rs.getString("production");
		String category = rs.getString("category");
		int price = rs.getInt("price");

		return new Product(no, production, category, price);
	}

	// 모든 행 조회
	@Override
	public List<Product> selectAll() {
		String sql = "SELECT no, production, category, price FROM products;";
		List<Product> list = new ArrayList<>();

		try (Connection conn = DBUtil.getConnection("my_db");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				Product product = resultMapping(rs);
				list.add(product);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// PreparedStatement
	// Statement 클래스의 기능 향상
	// 코드 안정성, 가독성 높음
	// 코드량 증가 => 매개 변수를 set(값 설정)해야하기 때문
	// 텍스트 SQL 호출

	// pk로 검색
	@Override
	public Product findByPK(int no) {
		String sql = "SELECT no, production, category, price FROM products WHERE no = ?";

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection("my_db");
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, no);

			rs = stmt.executeQuery();
			while (rs.next()) {
				return resultMapping(rs);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return null;
	}

	// 제조사로 검색
	@Override
	public List<Product> findByProduction(String production) {
		// 뭘 조건으로 두고 검색할지에 따라 where절의 ?가 항상 바뀌게 됨
		// 따옴표와 컬럼을 일일이 문자열로 작성하지않고
		// 값을 넣고싶은 칸에 ?를 넣어서 미완성의 쿼리문으로 만들어놓음
		// PreparedStatement에 쿼리문을 완성해달라고 요청
		String sql = "select no, production, category, price from products where production = ?";

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection("my_db");
			// ?가 포함되어있는 명령어(미완성의 쿼리문)를 넣어서 완성해달라고 요청
			stmt = conn.prepareStatement(sql);
			// ?에 값을 넣기위한 메소드 호출 => 값을 집어넣어달라고 부탁
			stmt.setString(1, production);

			List<Product> list = new ArrayList<>();
			rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(resultMapping(rs));
			}
			return list;

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return Collections.emptyList();
	}

	// 가격 범위로 검색
	@Override
	public List<Product> findByPriceRange(int start, int end) {
		String sql = "select * from products where price between ? and ?";

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection("my_db");
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, start);
			stmt.setInt(2, end);

			List<Product> list = new ArrayList<>();
			rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(resultMapping(rs));
			}
			return list;

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return Collections.emptyList();
	}

	// 카테고리 목록 중 일치하는 행 검색
	@Override
	public List<Product> findByCategories(List<String> categories) {
		String sql = "select * from products where category in" + makeParams(categories.size());

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection("my_db");
			stmt = conn.prepareStatement(sql);

			for (int i = 1; i <= categories.size(); i++) {
				stmt.setString(i, categories.get(i - 1));
			}
			rs = stmt.executeQuery();

			List<Product> list = new ArrayList<>();
			while (rs.next()) {
				list.add(resultMapping(rs));
			}
			return list;

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return Collections.emptyList();

	}

	private String makeParams(int size) {
		StringJoiner joiner = new StringJoiner(",", "(", ")");
		for (int i = 0; i < size; i++) {
			joiner.add("?");
		}
		return joiner.toString();
	}

	// 가격의 내림차순으로 제한된 행 조회하기
	@Override
	public List<Product> orderByPriceDesc(int limit, int offset) {
		String sql = "select * from products order by price desc limit ? offset ?";

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection("my_db");
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, limit);
			stmt.setInt(2, offset);

			List<Product> list = new ArrayList<>();
			rs = stmt.executeQuery();
			while (rs.next()) {
				list.add(resultMapping(rs));
			}
			return list;

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return Collections.emptyList();
	}

	// 행 추가하기 1 : 추가된 행의 개수 반환
	@Override
	public int insert(Product p) {
		return 0;
	}

	// 행 추가하기 2 : 추가된 행의 개수 반환
	@Override
	public int insert(String production, String category, int price) {
		String sql = "insert into my_db.products (production, category, price) values (?, ?, ?);";

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection("my_db");
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, production);
			stmt.setString(2, category);
			stmt.setInt(3, price);

			int rows = stmt.executeUpdate();

			return rows;

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return 0;
	}

	// 행 수정하기 1 : 변경된 행의 개수 반환
	@Override
	public int update(Product p) {
		return 0;
	}

	// 행 수정하기 2 : 변경된 행의 개수 반환
	@Override
	public int update(int no, String production, String category, int price) {
		String sql = "update products\r\n" + "set production = ?, category = ?, price = ?\r\n"
				+ "where no = ?";
		
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection("my_db");
			stmt = conn.prepareStatement(sql);
			stmt.setString(1, production);
			stmt.setString(2, category);
			stmt.setInt(3, price);
			stmt.setInt(4, no);

			int rows = stmt.executeUpdate();

			return rows;

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return 0;
	}

	// 행 삭제하기 : 삭제된 행의 개수 반환
	@Override
	public int delete(int no) {
		String sql = "delete from my_db.products where no = ?";

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conn = DBUtil.getConnection("my_db");
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, no);

			int rows = stmt.executeUpdate();

			return rows;

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DBUtil.closeAll(rs, stmt, conn);
		}
		return 0;
	}
}