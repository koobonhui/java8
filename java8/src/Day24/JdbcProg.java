package Day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProg {

	public static void main(String[] args) {
		
		String jdbc_url = "jdbc:mysql://localhost:3306/comeng?userUnicode=true" + "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";
		
		String sql = "SELECT * FROM student";
		try(Connection conn = DriverManager.getConnection(jdbc_url, "root", "yt1234"); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql);) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("접속함");
			System.out.println("<< 학생 명단 >>");
			System.out.println("[학번]\t\t[이름]");
			while(rs.next()) {
				int stuNo = rs.getInt("stuNo");
				String name = rs.getString("name");
				System.out.println(stuNo + "\t" + name);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException : " + e.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
