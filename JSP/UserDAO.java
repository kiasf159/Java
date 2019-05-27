package user;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sun.jdi.connect.spi.Connection;

public class UserDAO {

	private java.sql.Connection conn;
	private PreparedStatement pstment;
	private ResultSet rs;
	
	public UserDAO() {
		try
		{
			String dbURL = "jdbc:mysql://localhost:3306/BBS?serverTimezone=UTC";
			String dbID = "root";
			String dbPassword = "%^shj0227*";
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public int login(String userID, String userPassword)
	{
		String SQL = "SELECT userPassword FROM USER WHERE userID = ?";
		try
		{
			pstment = conn.prepareStatement(SQL);
			pstment.setString(1, userID);
			rs = pstment.executeQuery();
			if(rs.next())
			{
				if(rs.getString(1).equals(userPassword))
				{
					return 1;
				}
				else
					return 0; // 비번 일치x
			}
			return -1; // 아이디가 없음
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return -2; // db 오류
	}
}
