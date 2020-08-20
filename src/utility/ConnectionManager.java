package utility;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager{
	public static Connection getConnection() throws Exception {
		Properties prop=loadPropertiesFile();
		
		String driver=prop.getProperty("driver");
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("passwoord");
		
		System.out.println(driver);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		Class.forName(driver);
		Connection conn;
		conn=DriverManager.getConnection(url,username,password);
		if(conn!=null) {
			System.out.println("Establish");
		return conn;
		}
		return conn;
	}
	public static Properties loadPropertiesFile() throws Exception {
		Properties prop = new Properties();	
		InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
		prop.load(in);
		in.close(); 
		return prop;
	}
}
