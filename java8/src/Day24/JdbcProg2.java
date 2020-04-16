package Day24;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProg2 {

	public static void main(String[] args) {
		
		String jdbc_url = "jdbc:mysql://localhost:3306/comeng?userUnicode=true" + "&characterEncoding=UTF8&serverTimezone=Asia/Seoul";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM student WHERE sex = ? && address = ?";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("접속함");
			System.out.println("<< 학생 명단 >>");
			System.out.println("[학번]\t\t[이름]");
			conn = DriverManager.getConnection(jdbc_url, "root", "yt1234");
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "M");
			pstmt.setString(2, "Seoul");
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int stuNo = rs.getInt("stuNo");
				String name = rs.getString("name");
				System.out.println(stuNo + "\t" + name);
			}
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException : " + e.getMessage());
		} catch (SQLException se) {
			System.out.println(se.getMessage());
		} finally {
				try {
					if(rs != null) rs.close();
					if(pstmt != null) pstmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
		}
	}
}
