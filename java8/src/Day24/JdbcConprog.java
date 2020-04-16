package Day24;
import java.sql.*;
public class JdbcConprog {

	public static void main(String[] args) {
		
			String jdbc_url = "jdbc:mysql://localhost:3306/my_database?userUnicode=true" + "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";
			Connection conn = null;
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection(jdbc_url, "root", "yt1234");
				System.out.println("Á¢¼ÓÇÔ");
				conn.close();
			} catch (ClassNotFoundException e) {
				System.out.println("ClassNotFoundException : " + e.getMessage());
			} catch (SQLException se) {
				System.out.println(se.getMessage());
			} finally {
					try {
						if(conn != null) conn.close();
					} catch (SQLException e) {
							e.printStackTrace();
					  }
			}
	}
}
