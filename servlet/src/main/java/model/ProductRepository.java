package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dbutil.DBUtil;

public class ProductRepository {
	public List<Product> findAll() {
		try (Connection conn = DBUtil.getConnection("my_db");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT no, production, category, price FROM products")) {
			
			List<Product> list = new ArrayList<>();
			while (rs.next()) {
				int no = rs.getInt("no");
				String production = rs.getString("production");
				String category = rs.getString("category");
				int price = rs.getInt("price");
				
				list.add(Product.builder()
						.no(no)
						.production(production)
						.category(category)
						.price(price)
						.build());
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
