package ch20.stmt;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionExample {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "java";
			String passwords="oracle";
			conn = DriverManager.getConnection(url, user, passwords);
			System.out.println("연결성공");
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				conn.close();
				System.out.println("연결끊기");
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
