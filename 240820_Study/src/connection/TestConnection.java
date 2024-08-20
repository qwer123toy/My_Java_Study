package connection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import dbutil.DBUtil;

public class TestConnection {
	public static void main(String[] args) {
		try(Connection conn = DBUtil.getConnection("my_study_db");){
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select 200");
			if(rs.next()) {
				int result = rs.getInt(1);
				
				System.out.println(result == 200);
			}
		} catch (Exception e) {
		}
		
	}
}
