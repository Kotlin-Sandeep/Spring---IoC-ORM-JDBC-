package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Required;

public class DAO {
	
	private String driver;
	private String url;
	private String username;
	private String password;
	
	@Required
	public void setDriver(String driver) {
		this.driver = driver;
	}
	
	@Required
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}	
	public void getConnect() throws ClassNotFoundException, SQLException
	{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,username,password);
		
		System.out.println("connection established : "+ con);
	}
}
